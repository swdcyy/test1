package aac.d;
import n3d.a;
import com.yxcorp.gifshow.relation.explore.activity.ContactsListActivity;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class d implements a	// class@0000bb
{
    public final ContactsListActivity b;

    public void d(ContactsListActivity p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       d tb = this.b;
       if (p1 == -1) {
          tb.w3();
       }else {
          tb.finish();
       }
       return;
    }
}
