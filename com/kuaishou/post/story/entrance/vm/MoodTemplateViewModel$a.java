package com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$a;
import erd.o;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import x79.e;
import o56.c;
import o56.a;
import android.app.Application;
import o79.a;
import android.content.Context;
import brd.t;
import t45.d;
import brd.z;

public final class MoodTemplateViewModel$a implements o	// class@000b71
{
    public static final MoodTemplateViewModel$a b;

    static {
       MoodTemplateViewModel$a.b = new MoodTemplateViewModel$a();
    }
    public void MoodTemplateViewModel$a(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, MoodTemplateViewModel$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          ot = e.f().h(uoc.a(), a.c[0], 1, "post_story_editor").observeOn(d.a);
       }
       return ot;
    }
}
