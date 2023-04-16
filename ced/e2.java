package ced.e2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxObjectModel;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.UrlInfo;
import java.lang.CharSequence;
import zsd.u;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import ced.e2$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class e2 extends PresenterV2	// class@000550
{
    public ViewGroup p;
    public KwaiImageView q;
    public KwaiImageView r;
    public TextView s;
    public SearchItem t;
    public BaseFragment u;

    public void e2(){
       super();
    }
    public static final BaseFragment P8(e2 p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void E8(){
       KBoxObjectModel mCoverUrl;
       Iterator iterator;
       Object[] objArray1;
       String url;
       int i1;
       Object obj1;
       KBoxObjectModel mLikeCount;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e2.class, "3")) {
          return;
       }
       e2 tt = this.t;
       if (tt == null) {
          a.S("mSearchItem");
       }
       SearchItem mKBoxBaseIte = tt.mKBoxBaseItems;
       if (mKBoxBaseIte != null) {
          KBoxItem kBoxItem = CollectionsKt___CollectionsKt.p2(mKBoxBaseIte);
          if (kBoxItem != null) {
             kBoxItem = kBoxItem.mKboxModel;
          label_0025 :
             int i = 1;
             if (kBoxItem != null) {
                mCoverUrl = kBoxItem.mCoverUrl;
                if (mCoverUrl != null) {
                   iterator = mCoverUrl.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         objArray1 = iterator.next();
                         url = objArray1.getUrl();
                         if (url != null) {
                            i1 = u.S1(url) ^ i;
                            if (i1 == i) {
                               url = 1;
                            label_004e :
                               if (!url) {
                                  continue ;
                               }
                            }
                         }
                         url = null;
                         goto label_004e ;
                      }else {
                         objArray1 = objArray;
                      }
                      if (objArray1 != null) {
                         String url1 = objArray1.getUrl();
                         if (url1 != null) {
                            e2 tq = this.q;
                            if (tq == null) {
                               a.S("coverView");
                            }
                            tq.A(Uri.parse(url1), 0, 0);
                         }
                      }
                   }
                }
             }
             if (kBoxItem != null) {
                mCoverUrl = kBoxItem.mTemplateTagUrl;
                if (mCoverUrl != null) {
                   iterator = mCoverUrl.iterator();
                   while (iterator.hasNext()) {
                      Object obj = iterator.next();
                      url = obj.getUrl();
                      if (url != null) {
                         i1 = u.S1(url) ^ i;
                         if (i1 == i) {
                            obj1 = 1;
                         label_0093 :
                            if (obj1) {
                               objArray = obj;
                            }else {
                               continue ;
                            }
                         }
                      }
                      obj1 = null;
                      goto label_0093 ;
                   }
                   if (objArray != null) {
                      String url2 = objArray.getUrl();
                      if (url2 != null) {
                         e2 tr = this.r;
                         if (tr == null) {
                            a.S("tagView");
                         }
                         tr.A(Uri.parse(url2), 0, 0);
                      }
                   }
                }
             }
             e2 ts = this.s;
             if (ts == null) {
                a.S("likeCountView");
             }
             if (kBoxItem != null) {
                mLikeCount = kBoxItem.mLikeCount;
                if (mLikeCount != null) {
                label_00c2 :
                   ts.setText(mLikeCount);
                   ts = this.p;
                   if (ts == null) {
                      a.S("containerView");
                   }
                   ts.setOnClickListener(new e2$a(this, kBoxItem));
                   return;
                }
             }
             mLikeCount = "0";
             goto label_00c2 ;
          }
       }
       Object[] objArray2 = objArray;
       goto label_0025 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e2.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.container);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.container\)");
       this.p = view;
       view = m1.f(p0, R.id.cover);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.cover\)");
       this.q = view;
       view = m1.f(p0, R.id.tag);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.tag\)");
       this.r = view;
       p0 = m1.f(p0, R.id.like_count);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.like_count\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e2.class, "1")) {
          return;
       }
       Object obj = this.q8(SearchItem.class);
       a.o(obj, "inject\(SearchItem::class.java\)");
       this.t = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.u = obj;
       return;
    }
}
