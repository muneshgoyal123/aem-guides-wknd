package com.adobe.aem.guides.wknd.core.models.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.inject.Inject;

import com.adobe.aem.guides.wknd.core.models.helper.BookItem;
import com.adobe.aem.guides.wknd.core.models.Publication2;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;



@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { Publication2.class }, resourceType = {
    Publication2Impl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Publication2Impl implements Publication2
{
    protected static final String RESOURCE_TYPE = "wknd/components/publication2";
    

    @Self
    private SlingHttpServletRequest request;

    @SlingObject
    Resource componentResource;

    @ValueMapValue
    private String title1;

    @ValueMapValue
    private List<BookItem> books;



    @PostConstruct
    public void init()
    {
         books =new ArrayList<>();

        Resource res = componentResource.getChild("books");

        if(null != res && res.hasChildren()) {

            Iterator<Resource> cards = res.listChildren();

            while(cards.hasNext()) {

                Resource card = cards.next();

                BookItem book = new BookItem();

                book.setTitle2(card.getValueMap().get("title2", String.class));
                book.setDate(card.getValueMap().get("date", Date.class));
                book.setDescription(card.getValueMap().get("description", String.class));
                book.setCopies(card.getValueMap().get("copies", Integer.class));
                books.add(book);
    }
}
    }

    @Override
    public String getTitle1()
    {
             return title1;
    }
   
    @Override
     public List<BookItem> getBooks()
     {
         return books;
     }

    
    }
    


