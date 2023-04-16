package djc.e1;
import djc.n1;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import djc.e1$a;
import nsd.u;
import java.util.LinkedHashMap;
import djc.g1;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.PainterModel;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.Map;
import com.kwai.sharelib.KsShareApi;
import com.kwai.sharelib.KsShareApi$b;
import so7.c;
import com.kwai.sharelib.ui.poster.PosterType;
import com.kwai.sharelib.ui.poster.BigPicPoster;
import mp7.c;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import yo7.b;
import com.kwai.sharelib.ui.poster.BigQrPoster;
import com.kwai.sharelib.ui.poster.LongPicPoster;
import op7.f;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.ref.WeakReference;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.sharelib.model.TkConfig;
import qrd.l1;
import com.kwai.sharelib.ui.poster.ShortPicPoster;
import ap7.a;
import djc.e1$b;
import java.lang.Runnable;
import com.kwai.sharelib.model.PosterConfig;
import android.view.ViewGroup;
import android.app.Activity;
import ap7.a$a;
import com.yxcorp.utility.n;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import djc.c1;

public final class e1 extends RecyclerView$ViewHolder implements n1	// class@0021e4
{
    public final g1 b;
    public static final Map c;
    public static final e1$a d;

    static {
       e1.d = new e1$a(null);
       e1.c = new LinkedHashMap();
    }
    public void e1(g1 p0,View p1){
       a.p(p0, "adapter");
       a.p(p1, "view");
       super(p1);
       this.b = p0;
    }
    public final void a(PainterModel p0,ImmerseSharePanelFragment p1,int p2){
       BigPicPoster uBigPicPoste;
       f uof;
       Application uApplication;
       RecyclerView$ViewHolder itemView;
       RecyclerView$ViewHolder this;
       RecyclerView$ViewHolder viewHolder = this;
       Object obj = p0;
       String str = "itemView";
       if (PatchProxy.isSupport(e1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e1.class, "1")) {
          return;
       }
       a.p(obj, "painterModel");
       a.p(p1, "fragment");
       super();
       LongPicPoster longPicPoste = null;
       this.element = longPicPoste;
       Map c = e1.c;
       if (!c.containsKey(obj)) {
          this.getItemViewType();
          PainterModel mPosterTkCon = obj.mPosterTkConfig;
          KsShareApi$b uob = KsShareApi.s.d();
          c uoc = (uob != null)? uob.b(): longPicPoste;
          PainterModel mType = obj.mType;
          if (a.g(mType, PosterType.BIG_PIC.getValue())) {
             uBigPicPoste = new BigPicPoster();
             uBigPicPoste.u(p1.Zh());
             uBigPicPoste.t(p1.Uh());
          }else if(a.g(mType, PosterType.BIG_QR.getValue())){
             uBigPicPoste = new BigQrPoster();
             uBigPicPoste.u(p1.Zh());
             uBigPicPoste.t(p1.Uh());
          }else {
             String str1 = "AppEnv.getAppContext\(\)";
             if (a.g(mType, PosterType.LONG_PIC.getValue())) {
                longPicPoste = new LongPicPoster();
                longPicPoste.x(p1.Zh());
                longPicPoste.v(p1.Uh());
                if (mPosterTkCon != null && uoc != null) {
                   uof = new f();
                   uApplication = a.b();
                   a.o(uApplication, str1);
                   uof.q(uApplication);
                   uof.p(new WeakReference(p1.getActivity()));
                   uof.s(mPosterTkCon);
                   uof.r(uoc);
                   longPicPoste.w(uof);
                }
             }else if(a.g(mType, PosterType.SHORT_PIC.getValue())){
                longPicPoste = new ShortPicPoster();
                longPicPoste.x(p1.Zh());
                longPicPoste.v(p1.Uh());
                if (mPosterTkCon != null && uoc != null) {
                   uof = new f();
                   uApplication = a.b();
                   a.o(uApplication, str1);
                   uof.q(uApplication);
                   uof.p(new WeakReference(p1.getActivity()));
                   uof.s(mPosterTkCon);
                   uof.r(uoc);
                   longPicPoste.w(uof);
                }
             }
             uBigPicPoste = longPicPoste;
          }
          if (uBigPicPoste != null) {
             uBigPicPoste.d(true);
             c.put(obj, uBigPicPoste);
          }
          if (uBigPicPoste != null) {
             e1$b uob1 = new e1$b(uBigPicPoste, this, this, p1, p0);
             viewHolder.itemView.post(v9);
          }
       }else {
          Object obj1 = c.get(obj);
          if (obj1 != null) {
             FragmentActivity activity = p1.getActivity();
             a.m(activity);
             a.o(activity, "fragment.activity!!");
             View view = viewHolder.itemView.findViewById(R.id.poster_root_container);
             a.o(view, "itemView.findViewById<Vi¡­id.poster_root_container\)");
             View view1 = view;
             itemView = viewHolder.itemView;
             a.o(itemView, str);
             int measuredHeig = itemView.getMeasuredHeight();
             itemView = viewHolder.itemView;
             a.o(itemView, str);
             int measuredWidt = itemView.getMeasuredWidth();
             ViewGroup viewGroup = a$a.a(obj1, activity, new PosterConfig(), p0, view1, measuredHeig, measuredWidt, null, 64, null);
             this.element = viewGroup;
             if (viewGroup != null) {
                viewGroup = viewGroup.findViewById(R.id.poster_content_layout);
                if (viewGroup != null) {
                   longPicPoste = viewGroup;
                }else {
                label_01a5 :
                   Ref$ObjectRef element = this.element;
                   if (element != null) {
                      longPicPoste = element.findViewById(R.id.scroll_poster_content_layout);
                   }
                }
             }else {
                goto label_01a5 ;
             }
             if (longPicPoste != null) {
                itemView = viewHolder.itemView;
                a.o(itemView, str);
                this = viewHolder.itemView;
                a.o(this, str);
                longPicPoste.setPadding(n.c(itemView.getContext(), 18.00f), 0, n.c(this.getContext(), 18.00f), 0);
             }
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(e1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, e1.class, "2")) {
          return;
       }
       this.itemView.invalidate();
       return;
    }
    public void release(){
    }
}
