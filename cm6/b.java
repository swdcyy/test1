package cm6.b;
import java.lang.Object;
import java.util.ArrayList;
import android.content.Context;
import uv6.b;
import android.util.DisplayMetrics;
import uv6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.dynamic_prefetcher.data.config.PrefetchConfig;
import kv6.c;
import java.lang.Integer;
import java.util.List;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.lang.Math;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kwai.video.player.mid.manifest.ManifestInterface;
import hm6.f;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask$VodAdaptiveInit;
import com.kwai.framework.player.config.PhotoPlayerConfig;
import com.yxcorp.utility.NetworkUtilsCached;
import lnc.a1;
import ekd.p0;
import java.util.Objects;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import java.lang.StringBuilder;
import tv6.a;
import cm6.a;
import java.lang.Runnable;
import t45.c;

public class b	// class@000703
{
    public int a;
    public int b;
    public int c;
    public int d;
    public final List e;

    public void b(){
       super();
       this.a = 0;
       this.b = 0;
       this.e = new ArrayList();
       DisplayMetrics uDisplayMetr = c.c(b.a());
       if (uDisplayMetr != null) {
          this.c = uDisplayMetr.widthPixels;
          this.d = uDisplayMetr.heightPixels;
       }
       return;
    }
    public final boolean a(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (b.b() != null && (b.b().g != null && b.b().g.mBatchUrlCount > 3))? true: false;
       return b;
    }
    public final void b(int p0){
       int i3;
       int i4;
       VodAdaptivePreloadPriorityTask$VodAdaptiveInit obj1;
       ArrayList uArrayList;
       b uob2;
       int i6;
       QPhoto this;
       int i7;
       String str1;
       int i = this;
       int i1 = p0;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), i, uob, "6")) {
          return;
       }
       if (b.b() != null && b.b().g != null) {
          if (i1 >= (i.e.size() - 1)) {
             return;
          }else {
             b e = i.e;
             int i2 = -1;
             if (PatchProxy.isSupport(uob)) {
                String[] obj = PatchProxy.applyTwoRefs(e, Integer.valueOf(p0), i, uob, "7");
                if (obj != PatchProxyResult.class) {
                   i3 = obj.intValue();
                label_0051 :
                   i4 = i3;
                label_007d :
                   b e1 = i.e;
                   int i5 = i1 + 1;
                   b uob1 = null;
                   if (PatchProxy.isSupport(uob)) {
                      obj1 = uob1;
                      uArrayList = PatchProxy.applyThreeRefs(e1, Integer.valueOf(i5), Integer.valueOf(i4), this, b.class, "9");
                      if (uArrayList != PatchProxyResult.class) {
                      }else {
                      label_00a4 :
                         uArrayList = new ArrayList();
                         i6 = i5;
                         int i9 = 0;
                         while (i6 < e1.size()) {
                            this = e1.get(i6);
                            i.a = i6;
                            if (this instanceof QPhoto && (this.isVideoType() && !this.isHlsVideo())) {
                               String str = PatchProxy.applyOneRefs(this, obj1, uob, "10");
                               if (str != PatchProxyResult.class) {
                               }else {
                                  this = this.mEntity;
                                  if (this instanceof VideoFeed) {
                                     VideoMeta mMediaManife = this.mVideoModel.mMediaManifest;
                                     if (mMediaManife != null) {
                                        str1 = mMediaManife.toJsonString();
                                     label_00e8 :
                                        str = str1;
                                     }
                                  }
                                  str1 = obj1;
                                  goto label_00e8 ;
                               }
                               uArrayList.add(str);
                               i9 = i9 + 1;
                               if (i9 < i4) {
                               label_00f1 :
                                  i6 = i6 + 1;
                               }
                            }
                         }
                      }
                   }else {
                      obj1 = uob1;
                      goto label_00a4 ;
                   }
                   obj = new String[uArrayList.size()];
                   Object[] objArray = uArrayList.toArray(obj);
                   uob1 = i.e;
                   if (PatchProxy.isSupport(uob)) {
                      uob2 = uob1;
                      uArrayList = PatchProxy.applyThreeRefs(uob1, Integer.valueOf(i5), Integer.valueOf(i4), this, b.class, "8");
                      if (uArrayList != PatchProxyResult.class) {
                      }else {
                      label_0128 :
                         uArrayList = new ArrayList();
                         i6 = 0;
                         while (i5 < uob2.size()) {
                            b uob3 = uob2;
                            this = uob3.get(i5);
                            if (this instanceof QPhoto && (this.isVideoType() && !this.isHlsVideo())) {
                               b c = i.c;
                               uob1 = i.d;
                               f uof = f.class;
                               if (PatchProxy.isSupport(uof)) {
                                  obj1 = PatchProxy.applyThreeRefs(this, Integer.valueOf(c), Integer.valueOf(uob1), null, f.class, "12");
                                  if (obj1 != PatchProxyResult.class) {
                                  label_023e :
                                     uArrayList.add(obj1);
                                     i6 = i6 + 1;
                                     if (i6 < i4) {
                                     label_0246 :
                                        i5 = i5 + 1;
                                        uob2 = uob3;
                                        obj1 = null;
                                     }
                                  }
                               }
                               obj1 = new VodAdaptivePreloadPriorityTask$VodAdaptiveInit();
                               obj1.lowDevice = PhotoPlayerConfig.j();
                               obj1.clarityScore = PhotoPlayerConfig.b();
                               obj1.switchCode = f.a(this);
                               obj1.manifestType = 1;
                               obj1.rateConfig = f.f();
                               obj1.enableAegonNetSpeed = f.e();
                               obj1.signalStrength = 0;
                               String obj2 = PatchProxy.apply(null, null, uof, "13");
                               if (obj2 != PatchProxyResult.class) {
                                  i7 = obj2.intValue();
                               }else if(NetworkUtilsCached.l()){
                                  i7 = 1;
                               }else {
                                  obj2 = p0.u(a1.c());
                                  Objects.requireNonNull(obj2);
                                  int i8 = obj2.hashCode();
                                  if (i8 != -1512778493) {
                                     if (i8 != 1653) {
                                        if (i8 != 1684) {
                                           if (i8 != 1715) {
                                              if (i8 != 1746) {
                                                 if (i8 != 0x60303845 || !obj2.equals("5g\(sa\)")) {
                                                 label_021e :
                                                    this = -1;
                                                 }else {
                                                    this = 5;
                                                 }
                                              }else if(!obj2.equals("5g")){
                                                 goto label_021e ;
                                              }else {
                                                 this = 4;
                                              }
                                           }else if(!obj2.equals("4g")){
                                              goto label_021e ;
                                           }else {
                                              this = 3;
                                           }
                                        }else if(!obj2.equals("3g")){
                                           goto label_021e ;
                                        }else {
                                           this = 2;
                                        }
                                     }else if(!obj2.equals("2g")){
                                        goto label_021e ;
                                     }else {
                                        this = 1;
                                     }
                                  }else if(!obj2.equals("5g\(nsa\)")){
                                     goto label_021e ;
                                  }else {
                                     this = null;
                                  }
                                  if (this) {
                                     if (this != 1) {
                                        i7 = 3;
                                        if (this != 2) {
                                           if (this != i7) {
                                              if (this != 4 && this != 5) {
                                                 i7 = 0;
                                              }
                                           }else {
                                              i7 = 2;
                                           }
                                        }
                                     }else {
                                        i7 = 4;
                                     }
                                  }
                                  i7 = 5;
                               }
                               obj1.netType = i7;
                               obj1.devResWidth = c;
                               obj1.devResHeigh = uob1;
                               goto label_023e ;
                            }
                         }
                      }
                   }else {
                      uob2 = uob1;
                      goto label_0128 ;
                   }
                   VodAdaptivePreloadPriorityTask$VodAdaptiveInit[] vodAdaptiveI = new VodAdaptivePreloadPriorityTask$VodAdaptiveInit[uArrayList.size()];
                   VodAdaptivePreloadPriorityTask$VodAdaptiveInit[] vodAdaptiveI1 = uArrayList.toArray(vodAdaptiveI);
                   if (objArray.length > 0 && b.b().g.mBatchUrlCount != 5) {
                      VodAdaptivePreloadPriorityTask.setBatchUrl(objArray, vodAdaptiveI1);
                   }
                   a.l("BatchUrlReportHelperLogger", "reportBatchUrl batch url count: "+objArray.length+", lastBatchUrlPosition: "+i1+", currentBatchUrlPositon: "+i.a);
                }
             }
             if (b.b() == null || (b.b().g == null || q.f(e))) {
                i4 = 0;
                goto label_007d ;
             }else {
                i3 = Math.min(((e.size() + i2) - i1), b.b().g.mBatchUrlCount);
                goto label_0051 ;
             }
          }
       }
       return;
    }
    public void c(int p0,List p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       this.f(p1);
       this.e(p0);
       this.b = 0;
       return;
    }
    public void d(int p0,boolean p1,List p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "3")) {
          return;
       }
       if (b.b() != null && b.b().g != null) {
          this.b = this.b + 1;
          if (p0 < this.a && (p1 || this.b >= b.b().g.mBatchUrlCount)) {
             this.f(p2);
             this.e(this.a);
             this.b = 0;
          }
       }
       return;
    }
    public final void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       if (this.a()) {
          c.a(new a(this, p0));
       }else {
          this.b(p0);
       }
       return;
    }
    public final void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (this.a()) {
          b te = this.e;
          _monitor_enter(te);
          this.e.clear();
          this.e.addAll(p0);
          _monitor_exit(te);
       }else {
          this.e.clear();
          this.e.addAll(p0);
       }
       return;
    }
}
