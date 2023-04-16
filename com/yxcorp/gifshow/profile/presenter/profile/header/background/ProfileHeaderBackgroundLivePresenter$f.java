package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
import java.lang.Object;
import m4c.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.View;
import z5c.f3;
import m4c.k;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.TextureView$SurfaceTextureListener;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import m4c.d;
import lnc.a1;
import com.google.android.material.appbar.AppBarLayout;
import jp.a;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import wb5.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import kp.r1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.util.List;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import ekd.j;
import com.yxcorp.gifshow.autoplay.state.NetworkState;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import qrd.l1;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.autoplay.live.e;
import w99.g;
import t99.y;

public final class ProfileHeaderBackgroundLivePresenter$f implements g	// class@0014be
{
    public final ProfileHeaderBackgroundLivePresenter b;

    public void ProfileHeaderBackgroundLivePresenter$f(ProfileHeaderBackgroundLivePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a a;
       ProfileHeaderBackgroundLivePresenter h;
       boolean b;
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter$f.class, "1")) {
       }else {
          b uob = null;
          if (p0.d() == 2) {
             ProfileHeaderBackgroundLivePresenter$f tb = this.b;
             a.o(p0, "it");
             Objects.requireNonNull(tb);
             ProfileHeaderBackgroundLivePresenter profileHeade = ProfileHeaderBackgroundLivePresenter.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, profileHeade, "9")) {
                tb.I = tb.H;
                a = p0.a;
                if (a != null) {
                   tb.H = a;
                   tb.G = p0.b;
                   if (tb.w == null) {
                      p0 = tb.v;
                      if (p0 == null) {
                         a.S("mLiveViewStub");
                      }
                      p0 = f3.a(p0);
                      tb.w = p0;
                      if (p0 != null) {
                         p0.setOnClickListener(new k(tb));
                      }
                      p0 = tb.w;
                      if (p0 != null && !PatchProxy.applyVoidOneRefs(p0, tb, profileHeade, "10")) {
                         tb.A = m1.f(p0, 0x7f0a2666);
                         tb.x = m1.f(p0, 0x7f0a3105);
                         tb.z = m1.f(p0, 0x7f0a30e1);
                         tb.y = m1.f(p0, 0x7f0a2086);
                         tb.D = m1.f(tb.z, 0x7f0a26a0);
                         tb.E = m1.f(tb.z, 0x7f0a26a1);
                         p0 = tb.A;
                         if (p0 != null) {
                            p0.a(tb.T);
                         }
                      }
                   }
                label_00b3 :
                   p0 = tb.w;
                   int i = 0;
                   if (p0 != null) {
                      p0.getLayoutParams().width = n.z(p0.getContext());
                      p0.getLayoutParams().height = tb.S8(p0.getLayoutParams().width, tb.G);
                      tb.L = p0.getLayoutParams().height;
                      p0.setVisibility(i);
                      d a1 = d.a;
                      ProfileHeaderBackgroundLivePresenter r = tb.r;
                      if (r == null) {
                         a.S("mAppBarLayout");
                      }
                      a1.f(r, p0, (p0.getLayoutParams().height + a1.d(R.dimen.arg_RES_7f0702e8)));
                   }
                   p0 = tb.x;
                   if (p0 != null) {
                      h = tb.H;
                      a.m(h);
                      h.d(p0, h, a.b, uob);
                   }
                   if (!PatchProxy.applyVoid(uob, tb, profileHeade, "11")) {
                      p0 = PatchProxyResult.class;
                      LiveCoverWidgetModel obj = PatchProxy.apply(uob, tb, profileHeade, "12");
                      if (obj != p0) {
                         b = obj.booleanValue();
                      }else {
                         obj = PatchProxy.apply(uob, tb, profileHeade, "13");
                         if (obj != p0) {
                            b1 = obj.booleanValue();
                         }else {
                            h = tb.s;
                            if (h == null) {
                               a.S("mParam");
                            }
                            b1 = r1.S2(h.mBaseFeed);
                         }
                         if (!b1) {
                            obj = PatchProxy.apply(uob, tb, profileHeade, "15");
                            if (obj != p0) {
                               b1 = obj.booleanValue();
                            }else {
                               h = tb.H;
                               if (h != null) {
                                  a.m(h);
                                  if (r1.l1(h)) {
                                     b1 = true;
                                  }
                               }
                               b1 = false;
                            }
                            if (!b1) {
                               obj = PatchProxy.apply(uob, tb, profileHeade, "14");
                               if (obj != p0) {
                                  b1 = obj.booleanValue();
                               }else {
                                  h = tb.H;
                                  b uob1 = (!h instanceof LiveStreamFeed)? uob: h;
                                  if (uob1 != null && uob1.mLiveStreamModel != null) {
                                     Objects.requireNonNull(h, "null cannot be cast to non-null type com.kuaishou.android.model.feed.LiveStreamFeed");
                                     obj = h.mLiveStreamModel.mCoverWidgets.get(i);
                                     if (obj != null) {
                                        b1 = j.c(tb.Q, obj.mType);
                                     }else {
                                        b1 = false;
                                     }
                                  }else {
                                     b1 = true;
                                  }
                               }
                               if (!b1) {
                                  Object obj1 = PatchProxy.apply(uob, tb, profileHeade, "16");
                                  if (obj1 != p0) {
                                     b = obj1.booleanValue();
                                  }else if(tb.V8().b() == 1){
                                     b = true;
                                  }else {
                                     b = false;
                                  }
                                  if (b) {
                                     b = true;
                                  }
                               }
                            }
                         }
                      label_01cc :
                         b = false;
                      }
                      if (!b) {
                         tb.M = i;
                         b = tb.J;
                         if (b != null) {
                            b.release();
                         }
                         tb.X8();
                         tb.Y8();
                      }else if(a.g(tb.H, tb.I)){
                         tb.M = i;
                         b = tb.J;
                         if (b != null) {
                            b.release();
                         }
                         b = tb.H;
                         if (b != null) {
                            if (tb.J == null) {
                               tb.V8().a(tb.S);
                               l1 a2 = l1.a;
                            }
                            ProfileHeaderBackgroundLivePresenter t = tb.t;
                            if (t == null) {
                               a.S("mFragment");
                            }
                            e$a uoa = new e$a(b, t, 18, ":ks-features:ft-social:profile");
                            uoa.i(16);
                            uoa.c("profile");
                            uoa.e(true);
                            uoa.d(true);
                            uoa.h(237);
                            uoa.a(9);
                            e uoe = uoa.b();
                            a.o(uoe, "LiveAutoPlayParam.Builde¡­KGROUND\)\n        .build\(\)");
                            LiveAutoPlayModule liveAutoPlay = new LiveAutoPlayModule(uoe);
                            ProfileHeaderBackgroundLivePresenter z = tb.z;
                            if (z != null) {
                               z.setItemWeight(r1.k1(b));
                               z.setAutoPlayModule(liveAutoPlay);
                               z.setVisionFocus(true);
                            }
                            b = tb.A;
                            a.m(b);
                            liveAutoPlay.h0(b);
                            liveAutoPlay.O(tb.U);
                            tb.X8();
                            tb.Y8();
                            liveAutoPlay.startPlay();
                            liveAutoPlay.mute();
                            tb.J = liveAutoPlay;
                         }
                      }
                   }
                }
             }
          }else {
             p0 = this.b;
             p0.H = uob;
             p0.I = uob;
             p0 = p0.w;
             if (p0 != null) {
                p0.setVisibility(8);
             }
             this.b.a9("unbind");
          }
       }
    label_0288 :
       return;
    }
}
