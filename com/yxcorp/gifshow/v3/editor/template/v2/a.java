package com.yxcorp.gifshow.v3.editor.template.v2.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.template.v2.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2;

public class a extends Accessor	// class@00134a
{
    public final PicTemplateEditorFragmentV2$a c;
    public final e d;

    public void a(e p0,PicTemplateEditorFragmentV2$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
