package androidx.fragment.app.KwaiDialogFragment;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import java.util.WeakHashMap;
import java.util.Collection;
import ekd.q;
import java.util.List;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import java.lang.String;
import androidx.fragment.app.e;
import java.lang.Exception;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalArgumentException;
import java.lang.StackTraceElement;
import java.util.Iterator;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.os.Bundle;
import java.io.Serializable;
import java.lang.ClassCastException;
import androidx.fragment.app.FragmentActivity;
import android.view.Window;
import android.app.Activity;
import com.yxcorp.utility.j;
import java.lang.IllegalAccessException;
import java.lang.StringBuilder;
import ukd.a;
import java.lang.RuntimeException;
import android.content.DialogInterface$OnDismissListener;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.DialogInterface$OnCancelListener;
import android.content.Context;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import android.content.DialogInterface;
import android.app.Dialog;
import jz6.a;
import android.content.DialogInterface$OnShowListener;
import android.view.View;
import java.lang.Thread;
import java.util.ArrayList;

public class KwaiDialogFragment extends RxDialogFragment	// class@00079b
{
    public String c;
    public int d;
    public int e;
    public j f;
    public DialogInterface$OnDismissListener g;
    public DialogInterface$OnCancelListener h;
    public DialogInterface$OnShowListener i;
    public boolean j;
    public List k;
    public boolean l;
    public int m;
    public StackTraceElement[] n;
    public static WeakHashMap o;

    static {
       KwaiDialogFragment.o = new WeakHashMap();
    }
    public void KwaiDialogFragment(){
       super();
       this.l = false;
    }
    private void gh(){
       if (q.f(this.k)) {
          return;
       }
       KwaiDialogFragment kwaiDialogFr = this.bh(this.k);
       if (kwaiDialogFr == null) {
          return;
       }
       if (kwaiDialogFr.isAdded()) {
          this.hh(this.k, kwaiDialogFr);
          this.gh();
       }else if(kwaiDialogFr.mShownByMe == null){
          kwaiDialogFr.rh(this.getFragmentManager(), kwaiDialogFr.c, false);
       }else {
          this.hh(this.k, kwaiDialogFr);
       }
       return;
    }
    private void rh(c p0,String p1,boolean p2){
       if (this.isAdded()) {
          return;
       }
       boolean b = false;
       try{
          this.mDismissed = b;
          this.mShownByMe = true;
          e uoe = p0.beginTransaction();
          uoe.h(this, p1);
          if (p2) {
             uoe.o();
          label_001d :
             int i = this.e + true;
             this.e = i;
             if (i > 1) {
                this.jh("mShowCount:", i);
             }
          }else {
             uoe.m();
             goto label_001d ;
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public void Cb(c p0,String p1){
       this.c = p1;
       this.rh(p0, p1, true);
    }
    public final void Vg(){
       if (!SystemUtil.O() && SystemUtil.K()) {
          IllegalArgumentException illegalArgum = new IllegalArgumentException("You must call this method on the main thread");
          KwaiDialogFragment tn = this.n;
          if (tn != null) {
             illegalArgum.setStackTrace(tn);
          }
          illegalArgum.printStackTrace();
       }
       return;
    }
    public final boolean Wg(List p0,KwaiDialogFragment p1){
       if (q.f(p0)) {
          return false;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          WeakReference weakReferenc = iterator.next();
          if (weakReferenc != null && weakReferenc.get() == p1) {
             break ;
          }
       }
       return true;
    }
    public final void Xg(boolean p0){
       try{
          this.ih();
          if (p0 || this.isStateSaved()) {
             super.dismissAllowingStateLoss();
          }else {
             super.dismiss();
          }
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          ExceptionHandler.handleCaughtException(e1);
       }
       return;
    }
    public void Yg(){
       if (this.getArguments() == null) {
          this.setArguments(new Bundle());
       }
       return;
    }
    public Serializable Zg(String p0){
       return this.ah(p0, null);
    }
    public Serializable ah(String p0,Serializable p1){
       try{
          p0 = this.getArguments().get(p0);
          if (p0 == null) {
          }else {
             p1 = p0;
          }
          return p1;
       }catch(java.lang.ClassCastException e2){
          e2.printStackTrace();
          return null;
       }
    }
    public KwaiDialogFragment bh(List p0){
       WeakReference weakReferenc;
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          weakReferenc = iterator.next();
          if (weakReferenc != null && weakReferenc.get() != null) {
             break ;
          }
       }
       return weakReferenc.get();
    }
    public int ch(String p0,int p1){
       return this.getArguments().getInt(p0, p1);
    }
    public final void dh(){
       if (q.f(this.k)) {
          return;
       }
       KwaiDialogFragment kwaiDialogFr = this.bh(this.k);
       if (kwaiDialogFr == null) {
          return;
       }
       kwaiDialogFr = kwaiDialogFr.m;
       this.hh(this.k, this);
       if (!q.f(this.k) && kwaiDialogFr == 1) {
          Iterator iterator = this.k.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if (weakReferenc != null && (weakReferenc.get() == null || weakReferenc.get().m == 1)) {
                iterator.remove();
             }
          }
       }
       this.gh();
       return;
    }
    public void dismiss(){
       this.Xg(false);
    }
    public void dismissAllowingStateLoss(){
       this.Xg(true);
    }
    public final boolean eh(List p0){
       boolean b = (q.f(p0) || this.bh(p0) == null)? true: false;
       return b;
    }
    public boolean fh(){
       boolean b = (j.c(this.getActivity().getWindow()) && this.l == null)? true: false;
       return b;
    }
    public final void hh(List p0,KwaiDialogFragment p1){
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if (weakReferenc != null && (weakReferenc.get() == null || weakReferenc.get() == p1)) {
             try{
                iterator.remove();
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
                goto label_000b ;
             }
          }
       }
       return;
    }
    public final void ih(){
       this.Vg();
       if (q.f(this.k)) {
          return;
       }
       this.hh(this.k, this);
       if (this.k.isEmpty()) {
          KwaiDialogFragment.o.values().remove(this.k);
       }
       return;
    }
    public final void jh(String p0,int p1){
       try{
          Object[] objArray = new Object[]{new IllegalAccessException(p0+p1)};
          a.b("com.yxcorp.bugly.Bugly", "postCatchedException", objArray);
       }catch(java.lang.RuntimeException e7){
          e7.printStackTrace();
       }
       return;
    }
    public void k0(DialogInterface$OnDismissListener p0){
       this.g = p0;
    }
    public KwaiDialogFragment kh(String p0,int p1){
       this.Yg();
       this.getArguments().putInt(p0, p1);
       return this;
    }
    public KwaiDialogFragment lh(String p0,Serializable p1){
       this.Yg();
       SerializableHook.putSerializable(this.getArguments(), p0, p1);
       return this;
    }
    public KwaiDialogFragment mh(String p0,boolean p1){
       this.Yg();
       this.getArguments().putBoolean(p0, p1);
       return this;
    }
    public void nh(boolean p0){
       this.l = p0;
    }
    public void oh(DialogInterface$OnCancelListener p0){
       this.h = p0;
    }
    public void onActivityCreated(Bundle p0){
       super.onActivityCreated(p0);
    }
    public void onAttach(Context p0){
       AutoTracker.INSTANCE.onInit(this);
       super.onAttach(p0);
    }
    public void onCancel(DialogInterface p0){
       super.onCancel(p0);
       KwaiDialogFragment th = this.h;
       if (th != null) {
          th.onCancel(p0);
       }
       return;
    }
    public void onCreate(Bundle p0){
       AutoTracker.INSTANCE.onCreate(this);
       super.onCreate(p0);
    }
    public Dialog onCreateDialog(Bundle p0){
       return new a(this.getActivity(), this.getTheme());
    }
    public void onDestroyView(){
       AutoTracker.INSTANCE.onDestroy(this);
       super.onDestroyView();
    }
    public void onDismiss(DialogInterface p0){
       this.Vg();
       this.dh();
       super.onDismiss(p0);
       int i = 1;
       int i1 = this.d + i;
       this.d = i1;
       if (i1 > i) {
          this.jh("mDismissCount:", i1);
       }
       KwaiDialogFragment tg = this.g;
       if (tg != null && this.j != null) {
          tg.onDismiss(p0);
       }
       this.j = false;
       return;
    }
    public void onPause(){
       AutoTracker.INSTANCE.onPause(this);
       super.onPause();
    }
    public void onResume(){
       AutoTracker.INSTANCE.onResume(this);
       super.onResume();
    }
    public void onStart(){
       try{
          AutoTracker.INSTANCE.onStart(this);
          Dialog dialog = this.getDialog();
          if (this.fh() && dialog != null) {
             j oj = new j(dialog.getWindow());
             this.f = oj;
             oj.a();
             Window window = dialog.getWindow();
             try{
                window.setFlags(8, 8);
                super.onStart();
                dialog.getWindow().clearFlags(8);
             }catch(android.view.WindowManager$BadTokenException e0){
             }catch(java.lang.IllegalStateException e0){
             }catch(java.lang.IllegalArgumentException e0){
             }
             e0.printStackTrace();
             ExceptionHandler.handleCaughtException(e0);
             this.dismiss();
             return;
          }else {
             super.onStart();
          }
          KwaiDialogFragment ti = this.i;
          if (ti != null) {
             ti.onShow(dialog);
          }
          this.j = true;
          return;
       }catch(android.view.WindowManager$BadTokenException e0){
       }catch(java.lang.IllegalStateException e0){
       }catch(java.lang.IllegalArgumentException e0){
       }
       e0.printStackTrace();
       ExceptionHandler.handleCaughtException(e0);
       this.dismiss();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       AutoTracker iNSTANCE = AutoTracker.INSTANCE;
       iNSTANCE.trackFirstFrameOnFragment(this);
       super.onViewCreated(p0, p1);
       iNSTANCE.onViewCreated(this);
    }
    public void ph(DialogInterface$OnShowListener p0){
       this.i = p0;
    }
    public KwaiDialogFragment qh(int p0){
       this.m = p0;
       return this;
    }
    public final int show(e p0,String p1){
       return -1;
    }
    public void show(c p0,String p1){
       this.n = Thread.currentThread().getStackTrace();
       this.Vg();
       List list = KwaiDialogFragment.o.get(p0);
       this.k = list;
       if (list == null) {
          ArrayList uArrayList = new ArrayList();
          this.k = uArrayList;
          KwaiDialogFragment.o.put(p0, uArrayList);
       }
       if (this.Wg(this.k, this)) {
          return;
       }else {
          this.c = p1;
          this.k.add(new WeakReference(this));
          if (this.eh(this.k)) {
             this.rh(p0, p1, false);
          }
          return;
       }
    }
}
