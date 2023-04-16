package androidx.fragment.app.AlbumKwaiDialogFragment;
import androidx.fragment.app.CompatDialogFragment;
import java.util.WeakHashMap;
import java.lang.Object;
import java.util.List;
import java.util.Collection;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.view.Window;
import android.app.Activity;
import com.yxcorp.utility.j;
import ekd.q;
import androidx.fragment.app.c;
import java.lang.String;
import androidx.fragment.app.e;
import java.lang.IllegalAccessException;
import java.lang.StringBuilder;
import ukd.a;
import java.lang.Exception;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import hc7.a;
import android.content.Context;
import java.util.Iterator;
import android.content.DialogInterface$OnDismissListener;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.content.DialogInterface$OnShowListener;
import java.util.ArrayList;

public class AlbumKwaiDialogFragment extends CompatDialogFragment	// class@00076f
{
    public String g;
    public int h;
    public int i;
    public j j;
    public DialogInterface$OnDismissListener k;
    public DialogInterface$OnCancelListener l;
    public DialogInterface$OnShowListener m;
    public List n;
    public c o;
    public boolean p;
    public int q;
    public static WeakHashMap r;

    static {
       AlbumKwaiDialogFragment.r = new WeakHashMap();
    }
    public void AlbumKwaiDialogFragment(){
       super();
       this.p = false;
    }
    public void dismiss(){
       AlbumKwaiDialogFragment tn = this.n;
       if (tn != null) {
          tn.remove(this);
          if (this.n.isEmpty()) {
             AlbumKwaiDialogFragment.r.values().remove(this.n);
          }
       }
       super.dismiss();
       return;
    }
    public AlbumKwaiDialogFragment eh(List p0){
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return null;
          }
          if (p0.get(i) != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return p0.get(i);
    }
    public boolean fh(){
       boolean b = (j.c(this.getActivity().getWindow()) && this.p == null)? true: false;
       return b;
    }
    public final void gh(){
       if (!q.f(this.n)) {
          AlbumKwaiDialogFragment uAlbumKwaiDi = this.eh(this.n);
          if (uAlbumKwaiDi != null) {
             if (!uAlbumKwaiDi.isAdded()) {
                if (!this.Yg()) {
                   uAlbumKwaiDi.hh(this.getFragmentManager(), uAlbumKwaiDi.g, false);
                }else {
                   this.n.remove(uAlbumKwaiDi);
                }
             }else {
                this.n.remove(uAlbumKwaiDi);
                this.gh();
             }
          }
       }
       return;
    }
    public final void hh(c p0,String p1,boolean p2){
       try{
          if (!this.isAdded() && p0.findFragmentByTag(p1) == null) {
             boolean b = false;
             this.ah(b);
             boolean b1 = true;
             this.dh(b1);
             e uoe = p0.beginTransaction();
             uoe.h(this, p1);
             if (p2) {
                uoe.n();
             }else {
                uoe.m();
             }
             this.o = null;
             int i = this.i + b1;
             this.i = i;
             if (i > b1) {
                Object[] objArray = new Object[b1];
                objArray[b] = new IllegalAccessException("mShowCount:"+this.i);
                a.b("com.yxcorp.bugly.Bugly", "postCatchedException", objArray);
             }
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       super.onActivityCreated(p0);
    }
    public void onCancel(DialogInterface p0){
       super.onCancel(p0);
       AlbumKwaiDialogFragment tl = this.l;
       if (tl != null) {
          tl.onCancel(p0);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       return new a(this.getActivity(), this.getTheme());
    }
    public void onDismiss(DialogInterface p0){
       super.onDismiss(p0);
       AlbumKwaiDialogFragment tn = this.n;
       int i = 1;
       if (tn != null && !tn.isEmpty()) {
          tn = this.eh(this.n).q;
          this.n.remove(this);
          if (!q.f(this.n) && tn == i) {
             Iterator iterator = this.n.iterator();
             while (iterator.hasNext()) {
                if (iterator.next().q == i) {
                   iterator.remove();
                }
             }
          }
          this.gh();
       }
       int i1 = this.h + i;
       this.h = i1;
       if (i1 > i) {
          Object[] objArray = new Object[i];
          objArray[0] = new IllegalAccessException("mDismissCount:"+this.h);
          a.b("com.yxcorp.bugly.Bugly", "postCatchedException", objArray);
       }
       tn = this.k;
       if (tn != null) {
          tn.onDismiss(p0);
       }
       return;
    }
    public void onStart(){
       Dialog dialog = this.getDialog();
       if (this.fh() && dialog != null) {
          j oj = new j(dialog.getWindow());
          this.j = oj;
          oj.a();
          dialog.getWindow().setFlags(8, 8);
          super.onStart();
          dialog.getWindow().clearFlags(8);
       }else {
          super.onStart();
       }
       AlbumKwaiDialogFragment tm = this.m;
       if (tm != null) {
          tm.onShow(dialog);
       }
       return;
    }
    public final int show(e p0,String p1){
       return -1;
    }
    public final void show(c p0,String p1){
       List list = AlbumKwaiDialogFragment.r.get(p0);
       this.n = list;
       if (list == null) {
          ArrayList uArrayList = new ArrayList();
          this.n = uArrayList;
          AlbumKwaiDialogFragment.r.put(p0, uArrayList);
       }
       if (this.n.contains(this)) {
          return;
       }else {
          this.g = p1;
          this.o = p0;
          if (!this.n.isEmpty()) {
             this.n.add(this);
          }else {
             this.n.add(this);
             this.hh(p0, p1, false);
          }
          return;
       }
    }
}
