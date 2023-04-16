package com.yxcrop.gifshow.v3.editor.subtitle_v2.repo.SubtitleRepoUtils;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.repo.SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.List;
import xmd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;

public final class SubtitleRepoUtils	// class@000aea
{
    public static final p a;
    public static final SubtitleRepoUtils b;

    static {
       SubtitleRepoUtils.b = new SubtitleRepoUtils();
       SubtitleRepoUtils.a = s.c(SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2.INSTANCE);
    }
    public void SubtitleRepoUtils(){
       super();
    }
    public final a a(int p0,List p1){
       a obj;
       SubtitleRepoUtils subtitleRepo = SubtitleRepoUtils.class;
       if (PatchProxy.isSupport(subtitleRepo)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, subtitleRepo, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "list");
       Iterator iterator = p1.iterator();
       do {
          if (iterator.hasNext()) {
             obj = iterator.next();
             Object obj1 = (obj.e() == p0)? 1: null;
          }else {
             obj = null;
             break ;
          }
       } while (obj1);
       return obj;
    }
}
