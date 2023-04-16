package androidx.fragment.app.DialogFragment;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment$a;
import android.app.Dialog;
import android.os.Looper;
import android.os.Handler;
import android.content.DialogInterface;
import java.lang.Runnable;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import java.lang.IllegalStateException;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.Object;
import androidx.fragment.app.FragmentHostCallback;
import java.lang.StringBuilder;
import android.view.Window;

public class DialogFragment extends Fragment implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener	// class@000775
{
    public int mBackStackId;
    public boolean mCancelable;
    public Dialog mDialog;
    public Runnable mDismissRunnable;
    public boolean mDismissed;
    public Handler mHandler;
    public boolean mShownByMe;
    public boolean mShowsDialog;
    public int mStyle;
    public int mTheme;
    public boolean mViewDestroyed;

    public void DialogFragment(){
       super();
       this.mDismissRunnable = new DialogFragment$a(this);
       this.mStyle = 0;
       this.mTheme = 0;
       this.mCancelable = true;
       this.mShowsDialog = true;
       this.mBackStackId = -1;
    }
    public void dismiss(){
       this.dismissInternal(false, false);
    }
    public void dismissAllowingStateLoss(){
       this.dismissInternal(true, false);
    }
    public void dismissInternal(boolean p0,boolean p1){
       if (this.mDismissed != null) {
          return;
       }
       this.mDismissed = true;
       this.mShownByMe = false;
       DialogFragment tmDialog = this.mDialog;
       if (tmDialog != null) {
          tmDialog.setOnDismissListener(null);
          this.mDialog.dismiss();
          if (!p1) {
             if (Looper.myLooper() == this.mHandler.getLooper()) {
                this.onDismiss(this.mDialog);
             }else {
                this.mHandler.post(this.mDismissRunnable);
             }
          }
       }
       this.mViewDestroyed = true;
       if (this.mBackStackId >= null) {
          this.requireFragmentManager().popBackStack(this.mBackStackId, true);
          this.mBackStackId = -1;
       }else {
          e uoe = this.requireFragmentManager().beginTransaction();
          uoe.u(this);
          if (p0) {
             uoe.m();
          }else {
             uoe.l();
          }
       }
       return;
    }
    public Dialog getDialog(){
       return this.mDialog;
    }
    public boolean getShowsDialog(){
       return this.mShowsDialog;
    }
    public int getTheme(){
       return this.mTheme;
    }
    public boolean isCancelable(){
       return this.mCancelable;
    }
    public void onActivityCreated(Bundle p0){
       super.onActivityCreated(p0);
       if (this.mShowsDialog == null) {
          return;
       }
       View view = this.getView();
       if (view != null) {
          if (view.getParent() == null) {
             this.mDialog.setContentView(view);
          }else {
             throw new IllegalStateException("DialogFragment can not be attached to a container view");
          }
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          this.mDialog.setOwnerActivity(activity);
       }
       this.mDialog.setCancelable(this.mCancelable);
       this.mDialog.setOnCancelListener(this);
       this.mDialog.setOnDismissListener(this);
       if (p0 != null) {
          p0 = p0.getBundle("android:savedDialogState");
          if (p0 != null) {
             this.mDialog.onRestoreInstanceState(p0);
          }
       }
       return;
    }
    public void onAttach(Context p0){
       super.onAttach(p0);
       if (this.mShownByMe == null) {
          this.mDismissed = false;
       }
       return;
    }
    public void onCancel(DialogInterface p0){
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.mHandler = new Handler();
       boolean b = true;
       boolean b1 = (this.mContainerId == null)? true: false;
       this.mShowsDialog = b1;
       if (p0 != null) {
          this.mStyle = p0.getInt("android:style", 0);
          this.mTheme = p0.getInt("android:theme", 0);
          this.mCancelable = p0.getBoolean("android:cancelable", b);
          this.mShowsDialog = p0.getBoolean("android:showsDialog", this.mShowsDialog);
          this.mBackStackId = p0.getInt("android:backStackId", -1);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       return new Dialog(this.requireContext(), this.getTheme());
    }
    public void onDestroyView(){
       super.onDestroyView();
       DialogFragment tmDialog = this.mDialog;
       if (tmDialog != null) {
          this.mViewDestroyed = true;
          tmDialog.setOnDismissListener(null);
          this.mDialog.dismiss();
          if (this.mDismissed == null) {
             this.onDismiss(this.mDialog);
          }
          this.mDialog = null;
       }
       return;
    }
    public void onDetach(){
       super.onDetach();
       if (this.mShownByMe == null && this.mDismissed == null) {
          this.mDismissed = true;
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (this.mViewDestroyed == null) {
          this.dismissInternal(true, true);
       }
       return;
    }
    public LayoutInflater onGetLayoutInflater(Bundle p0){
       if (this.mShowsDialog == null) {
          return super.onGetLayoutInflater(p0);
       }
       Dialog uDialog = this.onCreateDialog(p0);
       this.mDialog = uDialog;
       if (uDialog == null) {
          return this.mHost.getContext().getSystemService("layout_inflater");
       }
       this.setupDialog(uDialog, this.mStyle);
       return this.mDialog.getContext().getSystemService("layout_inflater");
    }
    public void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       DialogFragment tmDialog = this.mDialog;
       if (tmDialog != null) {
          Bundle uBundle = tmDialog.onSaveInstanceState();
          if (uBundle != null) {
             p0.putBundle("android:savedDialogState", uBundle);
          }
       }
       tmDialog = this.mStyle;
       if (tmDialog != null) {
          p0.putInt("android:style", tmDialog);
       }
       tmDialog = this.mTheme;
       if (tmDialog != null) {
          p0.putInt("android:theme", tmDialog);
       }
       tmDialog = this.mCancelable;
       if (tmDialog == null) {
          p0.putBoolean("android:cancelable", tmDialog);
       }
       tmDialog = this.mShowsDialog;
       if (tmDialog == null) {
          p0.putBoolean("android:showsDialog", tmDialog);
       }
       tmDialog = this.mBackStackId;
       if (tmDialog != -1) {
          p0.putInt("android:backStackId", tmDialog);
       }
       return;
    }
    public void onStart(){
       super.onStart();
       DialogFragment tmDialog = this.mDialog;
       if (tmDialog != null) {
          this.mViewDestroyed = false;
          tmDialog.show();
       }
       return;
    }
    public void onStop(){
       super.onStop();
       DialogFragment tmDialog = this.mDialog;
       if (tmDialog != null) {
          tmDialog.hide();
       }
       return;
    }
    public final Dialog requireDialog(){
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          return dialog;
       }
       throw new IllegalStateException("DialogFragment "+this+" does not have a Dialog.");
    }
    public void setCancelable(boolean p0){
       this.mCancelable = p0;
       DialogFragment tmDialog = this.mDialog;
       if (tmDialog != null) {
          tmDialog.setCancelable(p0);
       }
       return;
    }
    public void setShowsDialog(boolean p0){
       this.mShowsDialog = p0;
    }
    public void setStyle(int p0,int p1){
       this.mStyle = p0;
       if (p0 == 2 || p0 == 3) {
          this.mTheme = 0x1030059;
       }
       if (p1) {
          this.mTheme = p1;
       }
       return;
    }
    public void setupDialog(Dialog p0,int p1){
       if (p1 != 1 && p1 != 2) {
          if (p1 != 3) {
          label_0016 :
             return;
          }else {
             p0.getWindow().addFlags(24);
          }
       }
       p0.requestWindowFeature(1);
       goto label_0016 ;
    }
    public int show(e p0,String p1){
       this.mDismissed = false;
       this.mShownByMe = true;
       p0.h(this, p1);
       this.mViewDestroyed = false;
       int i = p0.l();
       this.mBackStackId = i;
       return i;
    }
    public void show(c p0,String p1){
       this.mDismissed = false;
       this.mShownByMe = true;
       e uoe = p0.beginTransaction();
       uoe.h(this, p1);
       uoe.l();
    }
    public void showNow(c p0,String p1){
       this.mDismissed = false;
       this.mShownByMe = true;
       e uoe = p0.beginTransaction();
       uoe.h(this, p1);
       uoe.n();
    }
}
