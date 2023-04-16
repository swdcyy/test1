package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import ho2.m$b;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import java.io.IOException;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.io.File;
import java.util.Objects;
import wkd.b;
import j80.c;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ekd.a0;
import ftd.j2;
import ftd.z0;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3;

public final class LiveMultiLayerViewController$downloadDynamicResAndBindView$2 extends SuspendLambda implements p	// class@001343
{
    public final m$b $dynamicConfig;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public k0 p$;
    public final LiveMultiLayerViewController this$0;

    public void LiveMultiLayerViewController$downloadDynamicResAndBindView$2(LiveMultiLayerViewController p0,m$b p1,c p2){
       this.this$0 = p0;
       this.$dynamicConfig = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveMultiLayerViewController$downloadDynamicResAndBindView$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMultiLayerViewController$downloadDynamicResAndBindView$2(this.this$0, this.$dynamicConfig, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       LiveMultiLayerViewController$downloadDynamicResAndBindView$2 tL$4;
       LiveMultiLayerViewController$downloadDynamicResAndBindView$2 tL$0;
       String obj1;
       LiveMultiLayerViewController$downloadDynamicResAndBindView$2 uodownloadDy2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = b.h();
          LiveMultiLayerViewController$downloadDynamicResAndBindView$2 tlabel = this.label;
          int i = 3;
          LiveMultiLayerViewController$downloadDynamicResAndBindView$2 uodownloadDy = 2;
          LiveMultiLayerViewController$downloadDynamicResAndBindView$2 uodownloadDy1 = 1;
          if (tlabel != null) {
             try{
                if (tlabel != uodownloadDy1) {
                   try{
                      if (tlabel != uodownloadDy) {
                         if (tlabel != i) {
                            if (tlabel == 4) {
                               j0.n(p0);
                            }else {
                               throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                         }else {
                            try{
                               j0.n(p0);
                            label_0147 :
                               p0 = l1.a;
                            label_0196 :
                               return p0;
                            }catch(java.io.IOException e14){
                            }
                         label_017e :
                            this.L$0 = this.L$0;
                            this.L$1 = e14;
                            this.label = 4;
                            p0 = a.i(z0.g(), new LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3(this, e14, null), this);
                            if (p0 == obj) {
                               return obj;
                            }
                         }
                         goto label_0196 ;
                      }else {
                         tL$4 = this.L$4;
                         tlabel = this.L$3;
                         uodownloadDy = this.L$2;
                         uodownloadDy1 = this.L$1;
                         tL$0 = this.L$0;
                         j0.n(p0);
                      label_0124 :
                         uodownloadDy2 = tL$4;
                         tL$4 = tL$0;
                         tL$0 = tlabel;
                         tlabel = uodownloadDy1;
                      label_012b :
                         this.L$0 = tL$4;
                         this.L$1 = tlabel;
                         this.L$2 = uodownloadDy;
                         this.L$3 = tL$0;
                         this.L$4 = uodownloadDy2;
                         this.label = i;
                         if (a.i(z0.g(), new LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2(this, uodownloadDy2, null), this) == obj) {
                            return obj;
                         }else {
                            goto label_0147 ;
                         }
                      }
                   }catch(java.io.IOException e14){
                      obj1 = tL$0;
                      goto label_017e ;
                   }
                }else {
                   tL$4 = this.L$4;
                   tlabel = this.L$3;
                   uodownloadDy1 = this.L$2;
                   tL$0 = this.L$1;
                   uodownloadDy2 = this.L$0;
                   j0.n(p0);
                   p0 = uodownloadDy2;
                }
             }catch(java.io.IOException e14){
                obj1 = uodownloadDy2;
                goto label_017e ;
             }
          }else {
             j0.n(p0);
             p0 = this.p$;
             tlabel = this.this$0;
             Objects.requireNonNull(tlabel);
             File uFile = PatchProxy.apply(null, tlabel, LiveMultiLayerViewController.class, "11");
             if (uFile != patchProxyRe) {
             }else {
                uFile = b.a(-1504323719).c(".live_bg_animation");
             }
             obj1 = CollectionsKt___CollectionsKt.p2(this.$dynamicConfig.b());
             if (obj1 != null) {
                String str = this.$dynamicConfig.a();
                if (str == null) {
                   str = a0.c(obj1);
                }
                if (str != null) {
                   uodownloadDy2 = new Ref$ObjectRef();
                   File uFile1 = new File(uFile, str);
                   uodownloadDy2.element = uFile1;
                   if (!uFile1.exists()) {
                      this.L$0 = p0;
                      this.L$1 = uFile;
                      this.L$2 = obj1;
                      this.L$3 = str;
                      this.L$4 = uodownloadDy2;
                      this.label = uodownloadDy1;
                      if (a.i(z0.g(), new LiveMultiLayerViewController$downloadDynamicResAndBindView$2$1(this, null), this) == obj) {
                         return obj;
                      }else {
                         String str1 = obj1;
                         tL$4 = uodownloadDy2;
                         tL$0 = uFile;
                         String str2 = str;
                      }
                   }else {
                      String str3 = obj1;
                      tL$4 = p0;
                      goto label_012b ;
                   }
                }else {
                   throw new IOException("md5 digest fail for "+obj1);
                }
             }else {
                throw new IOException("invalid config, no url "+this.$dynamicConfig);
             }
          }
          this.L$0 = p0;
          this.L$1 = tL$0;
          this.L$2 = uodownloadDy1;
          this.L$3 = tlabel;
          this.L$4 = tL$4;
          this.label = uodownloadDy;
          if (this.this$0.c(this.$dynamicConfig, tL$4.element, this) == obj) {
             return obj;
          }else {
             uodownloadDy = uodownloadDy1;
             uodownloadDy1 = tL$0;
             tL$0 = p0;
             goto label_0124 ;
          }
       }catch(java.io.IOException e0){
          obj1 = p0;
          p0 = e0;
          goto label_017e ;
       }catch(java.io.IOException e14){
       }
    }
}
