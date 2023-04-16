package com.yxcorp.gifshow.v3.editor.template.v2.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.template.v2.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2$a;
import java.lang.Object;
import java.lang.Boolean;

public class c extends Accessor	// class@001382
{
    public final PicTemplateEditorFragmentV2$a c;
    public final e d;

    public void c(e p0,PicTemplateEditorFragmentV2$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.w);
    }
}
