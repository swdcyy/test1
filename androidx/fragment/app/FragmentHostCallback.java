package androidx.fragment.app.FragmentHostCallback;
import k2.a;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentManagerImpl;
import java.lang.Object;
import z1.h;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Intent;
import android.os.Bundle;
import java.lang.IllegalStateException;
import android.content.IntentSender;
import androidx.core.app.a;

public abstract class FragmentHostCallback extends a	// class@000782
{
    public final Activity mActivity;
    public final Context mContext;
    public final FragmentManagerImpl mFragmentManager;
    public final Handler mHandler;
    public final int mWindowAnimations;

    public void FragmentHostCallback(Activity p0,Context p1,Handler p2,int p3){
       super();
       this.mFragmentManager = new FragmentManagerImpl();
       this.mActivity = p0;
       h.h(p1, "context == null");
       this.mContext = p1;
       h.h(p2, "handler == null");
       this.mHandler = p2;
       this.mWindowAnimations = p3;
    }
    public void FragmentHostCallback(Context p0,Handler p1,int p2){
       Activity uActivity = (p0 instanceof Activity)? p0: null;
       super(uActivity, p0, p1, p2);
       return;
    }
    public void FragmentHostCallback(FragmentActivity p0){
       super(p0, p0, new Handler(), 0);
    }
    public Activity getActivity(){
       return this.mActivity;
    }
    public Context getContext(){
       return this.mContext;
    }
    public Handler getHandler(){
       return this.mHandler;
    }
    public void onAttachFragment(Fragment p0){
    }
    public void onDump(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
    }
    public View onFindViewById(int p0){
       return null;
    }
    public abstract Object onGetHost();
    public LayoutInflater onGetLayoutInflater(){
       return LayoutInflater.from(this.mContext);
    }
    public int onGetWindowAnimations(){
       return this.mWindowAnimations;
    }
    public boolean onHasView(){
       return true;
    }
    public boolean onHasWindowAnimations(){
       return true;
    }
    public void onRequestPermissionsFromFragment(Fragment p0,String[] p1,int p2){
    }
    public boolean onShouldSaveFragmentState(Fragment p0){
       return true;
    }
    public boolean onShouldShowRequestPermissionRationale(String p0){
       return false;
    }
    public void onStartActivityFromFragment(Fragment p0,Intent p1,int p2){
       this.onStartActivityFromFragment(p0, p1, p2, null);
    }
    public void onStartActivityFromFragment(Fragment p0,Intent p1,int p2,Bundle p3){
       if (p2 != -1) {
          throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
       }
       this.mContext.startActivity(p1);
       return;
    }
    public void onStartIntentSenderFromFragment(Fragment p0,IntentSender p1,int p2,Intent p3,int p4,int p5,int p6,Bundle p7){
       if (p2 != -1) {
          throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
       }
       a.k(this.mActivity, p1, p2, p3, p4, p5, p6, p7);
       return;
    }
    public void onSupportInvalidateOptionsMenu(){
    }
}
