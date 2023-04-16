package oc9.t;
import n3d.a;
import oc9.y;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import androidx.fragment.app.FragmentActivity;
import q16.a$a;
import android.view.View;
import com.yxcorp.gifshow.camerasdk.q;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;

public interface abstract t implements a, y	// class@0032f7
{

    void E1(boolean p0);
    void G();
    void L3(a p0);
    void N(long p0,long p1);
    boolean V3(FragmentActivity p0,a p1,a$a p2);
    void de(a$a p0,a p1);
    void k(View p0);
    void lc(a$a p0);
    void nb(q p0);
    void onActivityCallback(int p0,int p1,Intent p2);
    boolean onBackPressed();
    void onDestroy();
    void onDestroyView();
    boolean onKeyDown(int p0,KeyEvent p1);
    void onPause();
    void onResume();
    void onStart();
    void onStop();
    boolean onTouch(View p0,MotionEvent p1);
    boolean pc();
    void t1();
    void w();
    void w1(Intent p0);
}
