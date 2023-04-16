package f3a.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f3a.l$e;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import f3a.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;
import trd.n;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import f3a.l$f;
import erd.g;
import crd.b;
import f3a.l$g;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.view.View;
import qvb.q;
import qvb.a;
import uw9.o;
import q87.c;
import e0a.j;
import java.lang.StringBuilder;
import f3a.n;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.detail.ocrtext.OcrUiPresenter$layoutPostEnter$2;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import java.util.Objects;
import android.content.ClipboardManager;
import android.content.ClipData;
import a36.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import f3a.l$a;
import f3a.l$b;
import om6.k;
import f3a.l$c;
import f3a.l$d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import qrd.l1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.utility.SystemUtil;
import android.widget.ImageView;
import ekd.q;
import s0d.e;
import s0d.f;
import vb5.a;
import jd.c;
import s0d.a;
import uc.d;
import f3a.r;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import lnc.a1;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class l extends PresenterV2	// class@002290
{
    public RecyclerView p;
    public QPhoto q;
    public ObservableMap r;
    public TextView s;
    public TextView t;
    public KwaiImageView u;
    public View v;
    public Fragment w;
    public h x;
    public boolean y;
    public final q z;

    public void l(){
       super();
       this.z = new l$e(this);
    }
    public static final TextView P8(l p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mCopyText");
       }
       return p0;
    }
    public static final Fragment R8(l p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final h S8(l p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mPageList");
       }
       return p0;
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       l tq = this.q;
       String str = "mPhoto";
       if (tq == null) {
          a.S(str);
       }
       List atlasPhotosC = tq.getAtlasPhotosCdn(0);
       int i = 1;
       if (atlasPhotosC != null && (atlasPhotosC.isEmpty() ^ i) == i) {
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          this.Y8(tq.getAtlasPhotosCdn(0));
       }else {
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          if (tq.getCoverUrls() != null) {
             tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             CDNUrl[] coverUrls = tq.getCoverUrls();
             if (coverUrls != null) {
                int i1 = (!coverUrls.length)? 1: 0;
                if ((i1 ^ i) == i) {
                   tq = this.q;
                   if (tq == null) {
                      a.S(str);
                   }
                   coverUrls = tq.getCoverUrls();
                   a.o(coverUrls, "mPhoto.coverUrls");
                   this.Y8(n.t(coverUrls));
                }
             }
          }
       }
    label_006d :
       tq = this.r;
       str = "mChooseText";
       if (tq == null) {
          a.S(str);
       }
       this.Z8(tq.isEmpty());
       tq = this.r;
       if (tq == null) {
          a.S(str);
       }
       this.X7(tq.observable().subscribe(new l$f(this)));
       tq = this.s;
       if (tq == null) {
          a.S("mCopyText");
       }
       tq.setOnClickListener(new l$g(this));
       tq = this.v;
       if (tq == null) {
          a.S("mCloseBtn");
       }
       tq.setBackground(j.j(R.drawable.common_nav_close_black, 2));
       tq = this.x;
       if (tq == null) {
          a.S("mPageList");
       }
       tq.h(this.z);
       if (!PatchProxy.applyVoid(objArray, this, ol, "4")) {
          objArray = new Object[0];
          String str1 = "OcrUiPresenter";
          o.C().w(str1, "layoutPostEnter", objArray);
          if (!j.b()) {
             objArray = new Object[0];
             o.C().w(str1, "layoutPostEnter disable", objArray);
          }else {
             boolean b = j.s();
             boolean b1 = j.u();
             Object[] objArray1 = new Object[0];
             o.C().w(str1, "layoutPostEnter isCopyTextDialogStyle:"+b+", isCopyTextMoodType:"+b1, objArray1);
             if (b) {
                ol = this.t;
                if (ol != null) {
                   ol.setVisibility(8);
                }
             }else {
                ol = this.t;
                if (ol != null) {
                   ol.setVisibility(0);
                }
                ol = this.t;
                if (ol != null) {
                   ol.setOnClickListener(new n(this, b1));
                }
             }
             ol = this.w;
             if (ol == null) {
                a.S("mFragment");
             }
             ol.getLifecycle().addObserver(new OcrUiPresenter$layoutPostEnter$2(this));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       l tx = this.x;
       if (tx == null) {
          a.S("mPageList");
       }
       tx.f(this.z);
       return;
    }
    public final String V8(boolean p0){
       StringBuilder obj;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ol, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       int i = 0;
       l tr = this.r;
       if (tr == null) {
          a.S("mChooseText");
       }
       Iterator iterator = tr.entrySet().iterator();
       while (iterator.hasNext()) {
          obj = obj+iterator.next().getValue();
          l tr1 = this.r;
          if (tr1 == null) {
             a.S("mChooseText");
          }
          int i1 = tr1.size() - 1;
          if (i < i1 || p0) {
             obj = obj+10;
          }
          i = i + 1;
       }
       String str = obj;
       a.o(str, "sb.toString\(\)");
       return str;
    }
    public final void W8(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "5")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = "goToPost isMood:"+p0+", isSelected:";
       l tt = this.t;
       Object obj = null;
       Boolean uBoolean = (tt != null)? Boolean.valueOf(tt.isSelected()): obj;
       Object[] objArray = new Object[0];
       oo.w("OcrUiPresenter", str+uBoolean, objArray);
       String str1 = this.V8(0);
       Object[] objArray1 = new Object[0];
       o.C().w("OcrUiPresenter", "goToPost str:"+str1, objArray1);
       if (!TextUtils.isEmpty(str1)) {
          Context context = this.getContext();
          if (context != null) {
             obj = context.getSystemService("clipboard");
          }
          Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
          ClipData uClipData = ClipData.newPlainText("Label", str1);
          try{
             obj.setPrimaryClip(uClipData);
          }catch(java.lang.SecurityException e0){
          }
          if (p0) {
             y6.s(b.class, LoadPolicy.DIALOG).R(new l$a(this, e0), l$b.b);
          }else {
             y6.s(k.class, LoadPolicy.DIALOG).R(new l$c(this, e0), l$d.b);
          }
       }
       return;
    }
    public final void X8(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, l.class, "15")) {
          return;
       }
       super();
       this.action2 = p0;
       i3 oi3 = i3.f();
       oi3.d("type", p1);
       oi3.d("content_row", p2);
       this.params = oi3.e();
       l tw = this.w;
       if (tw == null) {
          a.S("mFragment");
       }
       Objects.requireNonNull(tw, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
       l ol = tw;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       tw = this.q;
       if (tw == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tw.mEntity);
       u1.M(p3, ol, 3, this, uContentPack, null);
       return;
    }
    public final void Y8(List p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "10")) {
          return;
       }
       if (SystemUtil.a(21) && p0 != null) {
          l tq = this.q;
          String str = "mPhoto";
          if (tq == null) {
             a.S(str);
          }
          if (tq.getHeight() > 0) {
             tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             if (tq.getWidth() > 0) {
                tq = this.u;
                if (tq == null) {
                   a.S("mBlurBackGroundImg");
                }
                tq.setVisibility(0);
                if (!PatchProxy.applyVoidOneRefs(p0, this, ol, "12") && !q.f(p0)) {
                   e[] uoeArray = PatchProxy.applyOneRefs(p0, this, ol, "13");
                   if (uoeArray != PatchProxyResult.class) {
                   }else {
                      f uof = f.x().q(p0);
                      f uof1 = uof.l(new a(35));
                      l tq1 = this.q;
                      if (tq1 == null) {
                         a.S(str);
                      }
                      int i = tq1.getHeight() / 8;
                      l tq2 = this.q;
                      if (tq2 == null) {
                         a.S(str);
                      }
                      uof1.p(new d(i, (tq2.getWidth() / 8)));
                      uoeArray = uof.w();
                   }
                   int len = (uoeArray != null)? uoeArray.length: 0;
                   if (len > 0) {
                      r or = new r(this);
                      object oobject = (uoeArray != null)? uoeArray[0]: null;
                      a.d(ImageRequestBuilder.d(oobject).a(), or);
                   }
                }
             }
          }
       }
    label_00b5 :
       return;
    }
    public final void Z8(boolean p0){
       l ts1;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "11")) {
          return;
       }
       l ts = this.s;
       if (ts == null) {
          a.S("mCopyText");
       }
       ts.setSelected((p0 ^ 0x01));
       ts = this.t;
       if (ts != null) {
          ts.setSelected((p0 ^ 0x01));
       }
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "7")) {
          boolean b = j.b();
          int i = 0;
          Object[] objArray = new Object[i];
          o.C().w("OcrUiPresenter", "updatePostEnterButton enableCopyTextEnter:"+b+", isEmpty:"+p0, objArray);
          if (!b) {
             Object[] objArray1 = new Object[i];
             o.C().w("OcrUiPresenter", "updatePostEnterButton disable", objArray1);
          }else {
             b = j.s();
             Object[] objArray2 = new Object[i];
             o.C().w("OcrUiPresenter", "updatePostEnterButton isCopyTextDialogStyle:"+b, objArray2);
             if (!b) {
                if (p0) {
                   ts1 = this.s;
                   if (ts1 == null) {
                      a.S("mCopyText");
                   }
                   ts1.setTextColor(a1.a(R.color.arg_RES_7f0620e9));
                   ts1 = this.t;
                   if (ts1 != null) {
                      ts1.setAlpha(0x3f000000);
                   }
                }else {
                   ts1 = this.s;
                   if (ts1 == null) {
                      a.S("mCopyText");
                   }
                   ts1.setTextColor(a1.a(R.color.arg_RES_7f0600a6));
                   ts1 = this.t;
                   if (ts1 != null) {
                      ts1.setAlpha(0x3f800000);
                   }
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.ocr_recyclerview);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.ocr_recyclerview\)");
       this.p = view;
       view = m1.f(p0, R.id.copy_text);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.copy_text\)");
       this.s = view;
       this.t = m1.f(p0, 0x7f0a097d);
       view = m1.f(p0, R.id.ocr_blur_background);
       a.o(view, "ViewBindUtils.bindWidget¡­R.id.ocr_blur_background\)");
       this.u = view;
       p0 = m1.f(p0, R.id.ocr_close_btn);
       a.o(p0, "ViewBindUtils.bindWidget¡­View, R.id.ocr_close_btn\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       Object obj = this.r8("OCR_TEXT_INFO");
       a.o(obj, "inject\(AccessIds.OCR_TEXT_INFO\)");
       this.q = obj;
       obj = this.r8("OCR_SELECTED_ITEMS");
       a.o(obj, "inject\(AccessIds.OCR_SELECTED_ITEMS\)");
       this.r = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.w = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.x = obj;
       return;
    }
}
