package com.kwai.library.feedback.FeedbackDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.kwai.library.feedback.FeedbackDialogFragment$a;
import nsd.u;
import xv6.b;
import vv6.g;
import vv6.f;
import com.kwai.library.feedback.FeedbackDialogFragment$c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.app.Dialog;
import com.kwai.library.feedback.FeedbackDialogFragment$d;
import android.content.DialogInterface$OnKeyListener;
import ag6.a;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import ekd.f;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.feedback.FeedbackDialogFragment$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class FeedbackDialogFragment extends BaseDialogFragment	// class@000825
{
    public TextView p;
    public RecyclerView q;
    public final b r;
    public final g s;
    public final f t;
    public final FeedbackDialogFragment$c u;
    public static final FeedbackDialogFragment$a v;

    static {
       FeedbackDialogFragment.v = new FeedbackDialogFragment$a(null);
    }
    public void FeedbackDialogFragment(b p0,g p1,f p2,FeedbackDialogFragment$c p3){
       a.p(p0, "feedbackData");
       a.p(p2, "feedbackConfig");
       a.p(p3, "mItemClickListener");
       super();
       this.r = p0;
       this.s = p1;
       this.t = p2;
       this.u = p3;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedbackDialogFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(1, R.style.arg_RES_7f110362);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FeedbackDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.setOnKeyListener(new FeedbackDialogFragment$d(this));
       }
       return a.c(p0, 0x7f0d043e, p1, false);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeedbackDialogFragment.class, "4")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, FeedbackDialogFragment.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             a.o(dialog, "dialog ?: return");
             dialog.setCancelable(true);
             dialog.setCanceledOnTouchOutside(true);
             Window window = dialog.getWindow();
             if (window != null) {
                objArray = window.getAttributes();
             }
             if (objArray != null) {
                objArray.gravity = 80;
             }
             if (objArray) {
                objArray.width = -1;
             }
             if (objArray) {
                objArray.height = -2;
             }
             Window window1 = dialog.getWindow();
             if (window1 != null) {
                window1.setAttributes(objArray);
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedbackDialogFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       f.f(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, FeedbackDialogFragment.class, "6")) {
          TextView textView = p0.findViewById(R.id.dialog_title);
          this.p = textView;
          if (textView != null) {
             TextPaint paint = textView.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(true);
             }
             textView.setText(this.r.title);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, FeedbackDialogFragment.class, "7")) {
          RecyclerView recyclerView = p0.findViewById(R.id.dialog_content);
          this.q = recyclerView;
          if (recyclerView != null) {
             recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
             recyclerView.setAdapter(new FeedbackDialogFragment$b(this.r, this.u));
          }
       }
       return;
    }
}
