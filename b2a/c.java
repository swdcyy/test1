package b2a.c;
import by6.e$b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import dy6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import android.app.Activity;
import b2a.d;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import dy6.c;
import java.util.Collection;
import ekd.q;
import dy6.b;
import dy6.d;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;

public class c implements e$b	// class@000356
{
    public final ProgressFragment a;
    public final String b;
    public final GifshowActivity c;
    public final NetworkDetectConfig d;
    public final QPhoto e;

    public void c(ProgressFragment p0,String p1,GifshowActivity p2,NetworkDetectConfig p3,QPhoto p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(a p0){
       BaseFeed entity;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.a.Eh(100, 100);
       this.a.dismiss();
       a.b(p0, this.b);
       if (!this.c.isFinishing()) {
          c td = this.d;
          String str = PatchProxy.applyTwoRefs(td, p0, null, d.class, "3");
          boolean b = false;
          if (str != PatchProxyResult.class) {
          }else {
             int i = 0x7f105042;
             if (p0 != null) {
                a b2 = p0.b;
                if (b2 != null && b2.size()) {
                   ArrayList uArrayList = new ArrayList();
                   a b1 = p0.b;
                   Iterator iterator = td.mNetworkDetectTaskGroups.iterator();
                   while (iterator.hasNext()) {
                      c uoc = iterator.next();
                      if (!q.f(uoc.mNetworkDetectTasks)) {
                         Iterator iterator1 = uoc.mNetworkDetectTasks.iterator();
                         while (iterator1.hasNext()) {
                            d uod = b1.get(iterator1.next());
                            if (uod != null && !q.f(uod.mResultCodes)) {
                               Iterator iterator2 = uod.mResultCodes.iterator();
                               while (iterator2.hasNext()) {
                                  String str1 = d.a.get(iterator2.next());
                                  if (!TextUtils.x(str1) && !uArrayList.contains(str1)) {
                                     uArrayList.add(str1);
                                  }else {
                                     continue ;
                                  }
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                   if (q.f(uArrayList)) {
                      str = a1.p(i);
                   }else if(uArrayList.size() == 1){
                      str = uArrayList.get(b);
                   }else {
                      StringBuilder str2 = "";
                      for (i = 0; i < uArrayList.size(); i = i1) {
                         if (i) {
                            str2 = str2+"\n";
                         }
                         int i1 = i + 1;
                         str2 = str2+i1+"."+uArrayList.get(i);
                      }
                      str = str2;
                   }
                }
             }
             str = a1.p(i);
          }
       }
       if (p0 != null) {
          p0 = p0.a;
          a.a("DefaultNetworkDetectManager detect complete");
          a.a("DefaultNetworkDetectManager detect complete id:"+p0.id+" mode:"+p0.mMode);
       }
       return;
    }
    public void onProgress(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.Fh(p0, 100, true);
       return;
    }
}
