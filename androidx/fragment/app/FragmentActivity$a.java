package androidx.fragment.app.FragmentActivity$a;
import androidx.lifecycle.ViewModelStoreOwner;
import o0.c;
import androidx.fragment.app.FragmentHostCallback;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import android.view.View;
import android.app.Activity;
import java.lang.Object;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import androidx.core.app.a;
import android.content.Intent;
import android.os.Bundle;
import android.content.IntentSender;

public class FragmentActivity$a extends FragmentHostCallback implements ViewModelStoreOwner, c	// class@000780
{
    public final FragmentActivity b;

    public void FragmentActivity$a(FragmentActivity p0){
       this.b = p0;
       super(p0);
    }
    public FragmentActivity a(){
       return this.b;
    }
    public Lifecycle getLifecycle(){
       return this.b.mFragmentLifecycleRegistry;
    }
    public OnBackPressedDispatcher getOnBackPressedDispatcher(){
       return this.b.getOnBackPressedDispatcher();
    }
    public ViewModelStore getViewModelStore(){
       return this.b.getViewModelStore();
    }
    public void onAttachFragment(Fragment p0){
       this.b.onAttachFragment(p0);
    }
    public void onDump(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       this.b.dump(p0, p1, p2, p3);
    }
    public View onFindViewById(int p0){
       return this.b.findViewById(p0);
    }
    public Object onGetHost(){
       return this.a();
    }
    public LayoutInflater onGetLayoutInflater(){
       return this.b.getLayoutInflater().cloneInContext(this.b);
    }
    public int onGetWindowAnimations(){
       Window window = this.b.getWindow();
       int i = (window == null)? 0: window.getAttributes().windowAnimations;
       return i;
    }
    public boolean onHasView(){
       Window window = this.b.getWindow();
       boolean b = (window != null && window.peekDecorView() != null)? true: false;
       return b;
    }
    public boolean onHasWindowAnimations(){
       boolean b = (this.b.getWindow() != null)? true: false;
       return b;
    }
    public void onRequestPermissionsFromFragment(Fragment p0,String[] p1,int p2){
       this.b.requestPermissionsFromFragment(p0, p1, p2);
    }
    public boolean onShouldSaveFragmentState(Fragment p0){
       return (this.b.isFinishing() ^ 0x01);
    }
    public boolean onShouldShowRequestPermissionRationale(String p0){
       return a.i(this.b, p0);
    }
    public void onStartActivityFromFragment(Fragment p0,Intent p1,int p2){
       this.b.startActivityFromFragment(p0, p1, p2);
    }
    public void onStartActivityFromFragment(Fragment p0,Intent p1,int p2,Bundle p3){
       this.b.startActivityFromFragment(p0, p1, p2, p3);
    }
    public void onStartIntentSenderFromFragment(Fragment p0,IntentSender p1,int p2,Intent p3,int p4,int p5,int p6,Bundle p7){
       this.b.startIntentSenderFromFragment(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public void onSupportInvalidateOptionsMenu(){
       this.b.supportInvalidateOptionsMenu();
    }
}
