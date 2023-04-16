package com.kwai.yoda.function.tool.HandleEntryTagFunction;
import ay7.a;
import com.kwai.yoda.function.tool.HandleEntryTagFunction$a;
import nsd.u;
import com.kwai.yoda.function.tool.HandleEntryTagFunction$Companion$entryTagHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import rx7.s;
import com.kwai.yoda.function.tool.HandleEntryTagFunction$EntryTagResult;
import com.kwai.yoda.function.tool.HandleEntryTagFunction$EntryTagResult$Data;
import java.util.Objects;
import r97.e0;
import java.util.List;

public final class HandleEntryTagFunction extends a	// class@001219
{
    public static final p d;
    public static final HandleEntryTagFunction$a e;

    static {
       HandleEntryTagFunction.e = new HandleEntryTagFunction$a(null);
       HandleEntryTagFunction.d = s.c(HandleEntryTagFunction$Companion$entryTagHelper$2.INSTANCE);
    }
    public void HandleEntryTagFunction(){
       super();
    }
    public String c(){
       return "handleEntryTag";
    }
    public String d(){
       return "tool";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Activity obj = PatchProxy.applyTwoRefs(p0, p1, this, HandleEntryTagFunction.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = s.b(p0);
       HandleEntryTagFunction$EntryTagResult uEntryTagRes = new HandleEntryTagFunction$EntryTagResult();
       HandleEntryTagFunction$EntryTagResult$Data uEntryTagRes1 = new HandleEntryTagFunction$EntryTagResult$Data();
       uEntryTagRes.mResult = 1;
       HandleEntryTagFunction$a e = HandleEntryTagFunction.e;
       Objects.requireNonNull(e);
       Object obj1 = PatchProxy.apply(null, e, HandleEntryTagFunction$a.class, str);
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = HandleEntryTagFunction.d.getValue();
       }
       boolean b = (p0 != null)? p0.isWebViewEmbedded(): false;
       uEntryTagRes1.entryTags = obj1.d(obj, p1, b);
       uEntryTagRes.setData(uEntryTagRes1);
       return uEntryTagRes;
    }
}
