package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2$a;
import erd.o;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2;
import java.lang.Object;
import sm7.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m50.h;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import ml5.a;
import com.kwai.sdk.eve.InferenceState;
import uea.a;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sm7.p;
import com.kuaishou.eve.kit.rerank.model.DiversityResult;
import e50.a;
import nsd.u;
import fg6.a;
import com.google.gson.Gson;
import kotlin.NoWhenBranchMatchedException;

public final class NasaHomePrefetchCacheRerankPresenter$activeRerank$2$a implements o	// class@000fcb
{
    public final NasaHomePrefetchCacheRerankPresenter$activeRerank$2 b;

    public void NasaHomePrefetchCacheRerankPresenter$activeRerank$2$a(NasaHomePrefetchCacheRerankPresenter$activeRerank$2 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       InferenceState cANCEL;
       String str3;
       h oh;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaHomePrefetchCacheRerankPresenter$activeRerank$2 obj = PatchProxy.applyOneRefs(p0, this, NasaHomePrefetchCacheRerankPresenter$activeRerank$2$a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          obj = this.b.this$0;
          Objects.requireNonNull(obj);
          a obj1 = PatchProxy.applyOneRefs(p0, obj, NasaHomePrefetchCacheRerankPresenter.class, "9");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             NasaHomePrefetchCacheRerankPresenter r = obj.r;
             _monitor_enter(r);
             String str = obj.S8(p0.h());
             int i = a.a[p0.g().ordinal()];
             int i1 = 1;
             String str1 = null;
             if (i != i1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i == 4) {
                         obj1 = p0.f();
                         String str2 = (obj1 != null)? obj1.toString(): str1;
                         if (TextUtils.n(str2, "noneDiverse")) {
                            obj.s = str1;
                            cANCEL = InferenceState.CANCEL;
                            p0 = p0.c();
                            str3 = (p0 != null)? p0.b(): str1;
                            oh = new h(0, null, str, cANCEL, -3, str3, null, 64, null);
                         }else if(i1 ^ a.g(p0.b(), obj.s)){
                            obj.s = str1;
                            cANCEL = InferenceState.CANCEL;
                            p0 = p0.c();
                            str3 = (p0 != null)? p0.b(): str1;
                            oh = new h(0, null, str, cANCEL, -1, str3, null, 64, null);
                         }else if(TextUtils.x(str2)){
                            obj.s = str1;
                            cANCEL = InferenceState.ERROR;
                            p0 = p0.c();
                            str3 = (p0 != null)? p0.b(): str1;
                            oh = new h(0, null, str, cANCEL, -1002, str3, null, 64, null);
                         }else {
                            DiversityResult uDiversityRe = a.a.h(str2, DiversityResult.class);
                            obj.s = str1;
                            cANCEL = InferenceState.SUCCESS;
                            p0 = p0.c();
                            str3 = (p0 != null)? p0.b(): str1;
                            oh = new h(uDiversityRe, null, str, cANCEL, 1, str3, null, 64, null);
                         }
                      }else {
                         throw new NoWhenBranchMatchedException();
                      }
                   }else {
                      obj.s = str1;
                      cANCEL = InferenceState.ERROR;
                      p0 = p0.c();
                      str3 = (p0 != null)? p0.b(): str1;
                      oh = new h(0, null, str, cANCEL, -1004, str3, null, 64, null);
                   }
                }else {
                   obj.s = str1;
                   cANCEL = InferenceState.ABORT;
                   p0 = p0.c();
                   str3 = (p0 != null)? p0.b(): str1;
                   oh = new h(0, null, str, cANCEL, -100, str3, null, 64, null);
                }
             }else {
                obj.s = str1;
                cANCEL = InferenceState.CANCEL;
                p0 = p0.c();
                str3 = (p0 != null)? p0.b(): str1;
                oh = new h(0, null, str, cANCEL, -1, str3, null, 64, null);
             }
             _monitor_exit(r);
          }
       }
       return obj;
    }
}
