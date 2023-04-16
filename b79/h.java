package b79.h;
import b79.i;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHeaderItemViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import java.lang.Integer;
import java.util.List;
import androidx.lifecycle.ViewModel;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b79.f;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import w69.d0;
import b79.g;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import ga9.b;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import android.content.Context;
import java.util.Objects;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.HashMap;

public final class h extends i	// class@000385
{
    public boolean e;
    public String f;
    public String g;
    public Integer h;
    public View$OnAttachStateChangeListener i;
    public f j;
    public final AbsAlbumHeaderItemViewBinder k;

    public void h(View p0,AbsAlbumHeaderItemViewBinder p1){
       a.q(p0, "mItemView");
       a.q(p1, "viewBinder");
       super(p0, p1);
       this.k = p1;
       this.h = Integer.valueOf(2);
    }
    public void a(Object p0,List p1,ViewModel p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "1")) {
       }else {
          a.q(p1, "payloads");
          if (p0 instanceof f) {
             this.j = p0;
             TextView textView = this.f().o();
             int i = 1;
             if (textView != null) {
                i1 = (!(p0.b()).length())? 1: 0;
                i1 = (i1)? 8: 0;
                textView.setVisibility(i1);
             }
             textView = this.f().o();
             if (textView != null) {
                textView.setText(p0.b());
             }
             ViewGroup viewGroup = this.f().n();
             ViewGroup$LayoutParams layoutParams = (viewGroup != null)? viewGroup.getLayoutParams(): null;
             d0 uod0 = p0.a();
             i1 = (uod0 != null)? uod0.h(): -2;
             if (layoutParams != null) {
                if (p0.c()) {
                   i = i1;
                }
                layoutParams.height = i;
                p0 = this.f().n();
                if (p0 != null) {
                   p0.setLayoutParams(layoutParams);
                }
             }
             if (this.i == null) {
                p0 = new g(this, i1);
                this.i = p0;
                this.itemView.addOnAttachStateChangeListener(p0);
             }
             if (this.e != null) {
                try{
                   this.e(this.j, false, i1);
                }catch(java.lang.IllegalArgumentException e7){
                   Log.k(e7);
                }
             }
          }
       }
    }
    public b b(){
       return this.f();
    }
    public final void e(c p0,boolean p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, h.class, "2")) {
          return;
       }
       if (this.f().j().getContext() == null) {
          return;
       }
       if (p0 instanceof f) {
          Objects.requireNonNull(p0);
          String str = "fm.beginTransaction\(\)";
          if (p0.c() && !p1) {
             d0 uod0 = p0.a();
             if (uod0 != null) {
                this.h(p2);
                c childFragmen = this.f().j().getChildFragmentManager();
                a.h(childFragmen, "viewBinder.fragment.childFragmentManager");
                Fragment uFragment = childFragmen.findFragmentById(R.id.header_list_container);
                e uoe = childFragmen.beginTransaction();
                a.h(uoe, str);
                if (uFragment != null) {
                   if (!uFragment.isVisible()) {
                      uoe.u(uFragment);
                   }
                }
                HashMap hashMap = new HashMap();
                h tf = this.f;
                if (tf != null) {
                   hashMap.put("taskId", tf);
                }
                tf = this.g;
                if (tf != null) {
                   hashMap.put("sceneClassifyId", tf);
                }
                hashMap.put("mediaTypeId", String.valueOf(this.h));
                Fragment uFragment1 = uod0.c(hashMap);
                if (uFragment1 != null) {
                   uoe.v(R.id.header_list_container, uFragment1);
                   uoe.m();
                }else {
                   this.h(1);
                }
             }
          }else {
             p0 = this.f().j().getChildFragmentManager();
             a.h(p0, "viewBinder.fragment.childFragmentManager");
             Fragment uFragment2 = p0.findFragmentById(R.id.header_list_container);
             if (uFragment2 != null) {
                e uoe1 = p0.beginTransaction();
                a.h(uoe1, str);
                uoe1.u(uFragment2);
                uoe1.m();
             }
          }
       }
       return;
    }
    public AbsAlbumHeaderItemViewBinder f(){
       return this.k;
    }
    public final void g(boolean p0){
       this.e = p0;
    }
    public final void h(int p0){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, h.class, "3")) {
          return;
       }
       ViewGroup viewGroup = this.f().n();
       ViewGroup$LayoutParams layoutParams = (viewGroup != null)? viewGroup.getLayoutParams(): null;
       if (layoutParams != null && layoutParams.height != p0) {
          layoutParams.height = p0;
          ViewGroup viewGroup1 = this.f().n();
          if (viewGroup1 != null) {
             viewGroup1.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
