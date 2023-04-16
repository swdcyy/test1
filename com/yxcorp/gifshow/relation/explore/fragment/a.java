package com.yxcorp.gifshow.relation.explore.fragment.a;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import o56.a;
import android.net.Uri;
import ekd.w0;

public final class a implements View$OnClickListener	// class@00180f
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void onClick(View p0){
       String str = "package";
       Context context = p0.getContext();
       try{
          Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
          intent.setData(w0.d(str, a.v, null));
          intent.putExtra(str, a.v);
          context.startActivity(intent);
       }catch(android.content.ActivityNotFoundException e0){
          context.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
       }
       return;
    }
}
