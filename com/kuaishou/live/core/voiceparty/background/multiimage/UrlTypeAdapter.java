package com.kuaishou.live.core.voiceparty.background.multiimage.UrlTypeAdapter;
import com.google.gson.b;
import com.kuaishou.live.core.voiceparty.background.multiimage.UrlTypeAdapter$a;
import nsd.u;
import kotlin.text.Regex;
import java.lang.String;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.background.multiimage.Url;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import zsd.k;
import zsd.i;
import zsd.h;
import ho2.o;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import ho2.p;

public final class UrlTypeAdapter implements b	// class@001368
{
    public static final Regex a;
    public static final UrlTypeAdapter$a b;

    static {
       UrlTypeAdapter.b = new UrlTypeAdapter$a(null);
       UrlTypeAdapter.a = new Regex("\\$\\{\(.+\)\\}");
    }
    public void UrlTypeAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       o oo = PatchProxy.applyThreeRefs(p0, p1, p2, this, UrlTypeAdapter.class, "1");
       if (oo != PatchProxyResult.class) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          a.p(p2, "context");
          String str = p0.w();
          a.o(str, "string");
          k ok = UrlTypeAdapter.a.matchEntire(str);
          if (ok != null) {
             int i = 1;
             h oh = ok.b().get(i);
             String str1 = (oh != null)? oh.f(): null;
             if (str1 != null && str1.length()) {
                i = 0;
             }
             if (!i) {
                oo = new o(str1);
             }else {
                throw new IllegalArgumentException("Invalid param name for src: "+str);
             }
          }else {
             oo = new p(str);
          }
       }
       return oo;
    }
}
