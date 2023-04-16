package com.yxcorp.gifshow.detail.player.panel.elements.TextElement$clickChecker$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class TextElement$clickChecker$1 extends Lambda implements l	// class@00162d
{
    public static final TextElement$clickChecker$1 INSTANCE;

    static {
       TextElement$clickChecker$1.INSTANCE = new TextElement$clickChecker$1();
    }
    public void TextElement$clickChecker$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextElement$clickChecker$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "<anonymous parameter 0>");
       return true;
    }
}
