package com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import android.view.View;
import rsd.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$viewFinder$1;
import msd.p;
import mqb.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$viewFinder$5;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$viewFinder$6;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$required$1;

public final class KotterKnifeKt	// class@0020a0
{

    public static final e a(View p0,int p1){
       KotterKnifeKt kotterKnifeK = KotterKnifeKt.class;
       if (PatchProxy.isSupport(kotterKnifeK)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, kotterKnifeK, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$bindView");
       return KotterKnifeKt.d(p1, KotterKnifeKt$viewFinder$1.INSTANCE);
    }
    public static final e b(Fragment p0,int p1){
       KotterKnifeKt kotterKnifeK = KotterKnifeKt.class;
       if (PatchProxy.isSupport(kotterKnifeK)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, kotterKnifeK, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$bindView");
       return KotterKnifeKt.d(p1, KotterKnifeKt$viewFinder$5.INSTANCE);
    }
    public static final e c(RecyclerView$ViewHolder p0,int p1){
       KotterKnifeKt kotterKnifeK = KotterKnifeKt.class;
       if (PatchProxy.isSupport(kotterKnifeK)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, kotterKnifeK, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$bindView");
       return KotterKnifeKt.d(p1, KotterKnifeKt$viewFinder$6.INSTANCE);
    }
    public static final a d(int p0,p p1){
       KotterKnifeKt kotterKnifeK = KotterKnifeKt.class;
       if (PatchProxy.isSupport(kotterKnifeK)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, kotterKnifeK, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "finder");
       return new a(new KotterKnifeKt$required$1(p1, p0));
    }
}
