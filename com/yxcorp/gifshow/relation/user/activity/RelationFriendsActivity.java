package com.yxcorp.gifshow.relation.user.activity.RelationFriendsActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.user.fragment.RelationFriendsFragment;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import zf6.l;
import ekd.i;

public class RelationFriendsActivity extends SingleFragmentActivity	// class@0019e1
{
    public static final int y;

    public void RelationFriendsActivity(){
       super();
    }
    public String getUrl(){
       return "ks://relation_friends";
    }
    public Fragment u3(){
       RelationFriendsFragment obj = PatchProxy.apply(null, this, RelationFriendsActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RelationFriendsFragment();
       obj.setArguments(this.getIntent().getExtras());
       i.h(this, 0, l.r());
       return obj;
    }
}
