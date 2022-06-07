/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.sample__002d__field;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class sample__002d__field__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
Collection var_collectionvar7_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.SampleField.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-sample\">\r\n  <div class=\"cmp-sample__firstname\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "fname"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\r\n  <div class=\"cmp-sample__lastname\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lname"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</div>\r\n  <div class=\"cmp-sample__languages\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "languages"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\r\n  <div class=\"cmp-sample__userImage\"><img");
{
    Object var_attrvalue3 = renderContext.getObjectModel().resolveProperty(_global_model, "userImage");
    {
        Object var_attrcontent4 = renderContext.call("xss", var_attrvalue3, "uri");
        {
            boolean var_shoulddisplayattr6 = (((null != var_attrcontent4) && (!"".equals(var_attrcontent4))) && ((!"".equals(var_attrvalue3)) && (!((Object)false).equals(var_attrvalue3))));
            if (var_shoulddisplayattr6) {
                out.write(" src");
                {
                    boolean var_istrueattr5 = (var_attrvalue3.equals(true));
                    if (!var_istrueattr5) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent4));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/></div>\r\n  ");
{
    Object var_collectionvar7 = renderContext.getObjectModel().resolveProperty(_global_model, "userInformation");
    {
        long var_size8 = ((var_collectionvar7_list_coerced$ == null ? (var_collectionvar7_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar7)) : var_collectionvar7_list_coerced$).size());
        {
            boolean var_notempty9 = (var_size8 > 0);
            if (var_notempty9) {
                {
                    long var_end12 = var_size8;
                    {
                        boolean var_validstartstepend13 = (((0 < var_size8) && true) && (var_end12 > 0));
                        if (var_validstartstepend13) {
                            out.write("<div class=\"cmp-sample_userInformation\">");
                            if (var_collectionvar7_list_coerced$ == null) {
                                var_collectionvar7_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar7);
                            }
                            long var_index14 = 0;
                            for (Object item : var_collectionvar7_list_coerced$) {
                                {
                                    boolean var_traversal16 = (((var_index14 >= 0) && (var_index14 <= var_end12)) && true);
                                    if (var_traversal16) {
                                        out.write("\r\n    <p>UserClass : <b>");
                                        {
                                            String var_17 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "userClass"), "text")) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_17));
                                        }
                                        out.write("</b></p>\r\n    <p>Designation : <b>");
                                        {
                                            Object var_18 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "designation"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_18));
                                        }
                                        out.write("</b></p>\r\n    <p>Age : <b>");
                                        {
                                            Object var_19 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "age"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_19));
                                        }
                                        out.write("</b></p>\r\n  ");
                                    }
                                }
                                var_index14++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar7_list_coerced$ = null;
}
out.write("\r\n  ");
{
    Object var_templatevar20 = renderContext.getObjectModel().resolveProperty(_global_placeholdertemplate, "placeholder");
    {
        boolean var_templateoptions21_field$_isempty = true;
        {
            java.util.Map var_templateoptions21 = obj().with("isEmpty", var_templateoptions21_field$_isempty);
            callUnit(out, renderContext, var_templatevar20, var_templateoptions21);
        }
    }
}
out.write("\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

