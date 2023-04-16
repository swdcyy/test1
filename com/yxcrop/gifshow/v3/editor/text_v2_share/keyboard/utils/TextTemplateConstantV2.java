package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2;
import msd.a;
import qrd.p;
import qrd.s;
import lnc.a1;
import tyc.f3;
import java.lang.Object;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import e17.i$b;
import e17.i;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.f;

public final class TextTemplateConstantV2	// class@000bbd
{
    public static final p a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final f3 l;
    public static final TextTemplateConstantV2 m;

    static {
       TextTemplateConstantV2.m = new TextTemplateConstantV2();
       TextTemplateConstantV2.a = s.c(TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2.INSTANCE);
       TextTemplateConstantV2.b = a1.e(8.00f);
       TextTemplateConstantV2.c = a1.e(60.00f);
       int i = a1.e(19.00f);
       TextTemplateConstantV2.d = i;
       int i1 = a1.e(4.00f);
       TextTemplateConstantV2.e = i1;
       i = (int)((float)(a1.h() - (i * 2)) * 0x3e546cf0) + (i1 * 2);
       TextTemplateConstantV2.f = i;
       TextTemplateConstantV2.g = (int)((float)i * 0x3f44ec4f);
       TextTemplateConstantV2.h = (int)(((float)(i - (i1 * 2)) * 0.23f) - (float)i1);
       TextTemplateConstantV2.i = (int)(((float)(i - (i1 * 2)) * 0.23f) - (float)(i1 * 2));
       TextTemplateConstantV2.j = a1.e(18.00f);
       TextTemplateConstantV2.k = a1.e(3.00f);
       TextTemplateConstantV2.l = new f3(200);
    }
    public void TextTemplateConstantV2(){
       super();
    }
    public final int a(){
       return TextTemplateConstantV2.b;
    }
    public final f3 b(){
       return TextTemplateConstantV2.l;
    }
    public final int c(){
       return TextTemplateConstantV2.g;
    }
    public final int d(){
       return TextTemplateConstantV2.h;
    }
    public final int e(){
       return TextTemplateConstantV2.f;
    }
    public final void f(int p0,ViewGroup p1){
       TextTemplateConstantV2 textTemplate = TextTemplateConstantV2.class;
       if (PatchProxy.isSupport(textTemplate) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textTemplate, "2")) {
          return;
       }
       a.p(p1, "containerView");
       i$b uob = i.m();
       uob.y(f.o(p0));
       uob.n(p1);
       i.z(uob);
       return;
    }
}
