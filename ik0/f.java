package ik0.f;
import android.content.Intent;
import android.view.KeyEvent;

public interface abstract f	// class@002910
{

    void onActivityResult(int p0,int p1,Intent p2);
    boolean onBackPressed();
    boolean onKeyDown(int p0,KeyEvent p1);
    boolean onKeyLongPress(int p0,KeyEvent p1);
    boolean onKeyUp(int p0,KeyEvent p1);
    boolean onNewIntent(Intent p0);
    void onWindowFocusChanged(boolean p0);
}
