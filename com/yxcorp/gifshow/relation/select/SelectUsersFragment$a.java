package com.yxcorp.gifshow.relation.select.SelectUsersFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.relation.select.SelectUsersFragment;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.os.IBinder;
import com.yxcorp.utility.n;

public class SelectUsersFragment$a extends RecyclerView$r	// class@001985
{
    public final View a;
    public final SelectUsersFragment b;

    public void SelectUsersFragment$a(SelectUsersFragment p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(SelectUsersFragment$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SelectUsersFragment$a.class, "1")) {
          return;
       }
       if (p1 == 1 || p1 == 2) {
          n.E(this.b.getContext(), this.a.getWindowToken());
       }
       return;
    }
}