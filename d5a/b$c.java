package d5a.b$c;
import erd.g;
import d5a.b;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.content.ContentResolver;
import android.provider.Settings$System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import fx6.b;
import yw6.g;
import yw6.h;
import qvb.n0;
import wvb.e;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import joc.a0;
import ge5.d;
import joc.z;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import bm5.e;
import bm5.e$a;
import uw9.o;
import q87.c;

public final class b$c implements g	// class@001e79
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       b obj1;
       boolean b1;
       View obj3;
       Object[] objArray1;
       Fragment uFragment;
       int i = p0.intValue();
       b$c uoc = b$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoc, "1")) {
          uoc = this.b;
          Objects.requireNonNull(uoc);
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoc, uob, "5")) {
             if (uoc.getContext() != null) {
                Context context = uoc.getContext();
                a.m(context);
                a.o(context, "context!!");
                if (!Settings$System.getInt(context.getContentResolver(), "accelerometer_rotation", 0)) {
                label_028e :
                   Object[] objArray = new Object[0];
                   o.C().y("GravityAccessPresenter", "disableGravityEnterLand", objArray);
                }
             }
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             b obj = PatchProxy.apply(null, uoc, uob, "7");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = uoc.p;
                if (obj == null) {
                   a.S("mFragment");
                }
                if (obj.Vg().a()) {
                   obj = uoc.y;
                   if (obj != null && obj.a() != 1) {
                      obj = uoc.y;
                      String str = "11";
                      if (obj != null) {
                         obj1 = PatchProxy.apply(null, obj, SlidePlayViewModel.class, "130");
                         if (obj1 != patchProxyRe) {
                            b1 = obj1.booleanValue();
                         }else {
                            obj = obj.Q0("kwai_data_source_service");
                            if (obj != null) {
                               Object obj5 = PatchProxy.apply(null, obj, b.class, "21");
                               if (obj5 != patchProxyRe) {
                                  b1 = obj5.booleanValue();
                               }else {
                                  g og = obj.a.e();
                                  Objects.requireNonNull(og);
                                  obj5 = PatchProxy.apply(null, og, g.class, str);
                                  if (obj5 != patchProxyRe) {
                                     b1 = obj5.booleanValue();
                                  }else {
                                     og = og.g;
                                     if (og instanceof n0) {
                                        b1 = og.g();
                                     }else if(og instanceof e){
                                        Objects.requireNonNull(og);
                                        obj5 = PatchProxy.apply(null, og, e.class, "4");
                                        if (obj5 != patchProxyRe) {
                                           b1 = obj5.booleanValue();
                                        }else {
                                           e b2 = og.b;
                                           if (b2 instanceof n0 && b2.g()) {
                                              b1 = true;
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                            b1 = false;
                         }
                         if (b1 == true) {
                         label_0274 :
                            b = true;
                         }
                      }
                      Activity obj2 = PatchProxy.apply(null, uoc, uob, "13");
                      if (obj2 != patchProxyRe) {
                         b1 = obj2.booleanValue();
                      }else {
                         obj = uoc.p;
                         if (obj == null) {
                            a.S("mFragment");
                         }
                         obj3 = obj.getView();
                         if (obj3 != null) {
                            obj3.getLocationInWindow(uoc.C);
                         }
                         b1 = uoc.C[0];
                         obj1 = uoc.p;
                         if (obj1 == null) {
                            a.S("mFragment");
                         }
                         View view = obj1.getView();
                         if (view != null) {
                            view = view.getRootView();
                            if (view != null) {
                               view.getLocationInWindow(uoc.C);
                            }
                         }
                         if (uoc.C[0] != b1) {
                            b1 = true;
                         }else {
                            b1 = false;
                         }
                      }
                      if (!b1) {
                         obj2 = PatchProxy.apply(null, uoc, uob, str);
                         if (obj2 != patchProxyRe) {
                            b1 = obj2.booleanValue();
                         }else {
                            obj = uoc.z;
                            b1 = (obj != null && !obj.getVisibility())? true: false;
                         }
                         if (!b1) {
                            obj2 = uoc.getActivity();
                            if (obj2 == null || (obj2.hasWindowFocus() && (!uoc.R8() && uoc.D == null))) {
                               obj = uoc.y;
                               if (obj == null || obj.n0() != true) {
                                  obj = uoc.w;
                                  if (obj != null) {
                                     a0 uoa0 = obj.b();
                                     if (uoa0 != null && uoa0.b == true) {
                                     }
                                  }
                                  obj3 = PatchProxy.apply(null, uoc, uob, "8");
                                  if (obj3 != patchProxyRe) {
                                     b1 = obj3.booleanValue();
                                  }else {
                                     obj = uoc.B;
                                     if (obj != null && obj.isShown() == true) {
                                        obj = uoc.B;
                                        b1 = (obj != null)? obj.getWidth(): 0;
                                        if (b1 > 0) {
                                           obj = uoc.B;
                                           b1 = (obj != null)? obj.getHeight(): 0;
                                           if (b1 > 0) {
                                              b1 = true;
                                           }
                                        }
                                     }
                                  label_01d1 :
                                     b1 = false;
                                  }
                                  if (!b1) {
                                     obj3 = PatchProxy.apply(null, uoc, uob, "12");
                                     if (obj3 != patchProxyRe) {
                                        b1 = obj3.booleanValue();
                                     }else {
                                        obj2 = uoc.getActivity();
                                        if (!obj2 instanceof GifshowActivity) {
                                           objArray1 = null;
                                        }
                                        if (objArray1 != null) {
                                           c supportFragm = objArray1.getSupportFragmentManager();
                                           if (supportFragm != null) {
                                              uFragment = supportFragm.findFragmentByTag("SerialEpisodePanelFragment");
                                           label_01fe :
                                              uoc.A = uFragment;
                                              if (uFragment != null && uFragment.isVisible() == true) {
                                                 b1 = true;
                                              }else {
                                                 b1 = false;
                                              }
                                           }
                                        }
                                        uFragment = null;
                                        goto label_01fe ;
                                     }
                                     if (!b1) {
                                        obj3 = PatchProxy.apply(null, uoc, uob, "9");
                                        if (obj3 != patchProxyRe) {
                                           b1 = obj3.booleanValue();
                                        }else {
                                           obj = uoc.p;
                                           if (obj == null) {
                                              a.S("mFragment");
                                           }
                                           obj3 = obj.getView();
                                           if (obj3 != null) {
                                              obj3 = obj3.findViewById(R.id.corona_vip_buy_tips_content);
                                              if (obj3 != null && !obj3.getVisibility()) {
                                                 b1 = true;
                                              }
                                           }
                                           b1 = false;
                                        }
                                        if (!b1 && uoc.E == null) {
                                           View obj4 = PatchProxy.apply(null, uoc, uob, "10");
                                           if (obj4 != patchProxyRe) {
                                              b = obj4.booleanValue();
                                           }else {
                                              uob = uoc.p;
                                              if (uob == null) {
                                                 a.S("mFragment");
                                              }
                                              obj4 = uob.getView();
                                              if (obj4 != null) {
                                                 obj4 = obj4.findViewById(R.id.slide_play_empty_photo_tip);
                                                 if (obj4 != null && !obj4.getVisibility()) {
                                                    b = true;
                                                 }
                                              }
                                              b = false;
                                           }
                                           if (b) {
                                              goto label_0274 ;
                                           }else {
                                              b = false;
                                           }
                                        }else {
                                           goto label_0274 ;
                                        }
                                     }else {
                                        goto label_0274 ;
                                     }
                                  }else {
                                     goto label_0274 ;
                                  }
                               }else {
                                  goto label_0274 ;
                               }
                            }else {
                               goto label_0274 ;
                            }
                         }else {
                            goto label_0274 ;
                         }
                      }else {
                         goto label_0274 ;
                      }
                   }else {
                      goto label_0274 ;
                   }
                }else {
                   goto label_0274 ;
                }
             }
             if (b || !e.a.a()) {
                goto label_028e ;
             }else if(i != 1){
                if (i == 3) {
                   uoc.P8(true);
                }
             }else {
                uoc.P8(0);
             }
          }
       }
       return;
    }
}
