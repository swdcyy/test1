package com.yxcorp.gifshow.follow.init.plugin.fragment.FollowStaggerProxyFragment;
import com.yxcorp.gifshow.follow.init.plugin.fragment.FollowStaggerBasePluginProxyFragment;
import com.yxcorp.gifshow.follow.init.plugin.fragment.FollowStaggerProxyFragment$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import tkd.b;
import tkd.d;
import lv5.c;
import lv5.b;
import kotlin.jvm.internal.a;

public final class FollowStaggerProxyFragment extends FollowStaggerBasePluginProxyFragment	// class@0010ba
{
    public static final FollowStaggerProxyFragment$a l;

    static {
       FollowStaggerProxyFragment.l = new FollowStaggerProxyFragment$a(null);
    }
    public void FollowStaggerProxyFragment(){
       super();
    }
    public Fragment ch(){
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerProxyFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER_PLUGIN.appendTag("FollowStaggerProxyFragment"), "createRealFragment");
       obj = d.a(-242212848).a10();
       a.o(obj, "PluginManager.get\(HomeFo¡­meFollowStaggerFragment\(\)");
       return obj;
    }
    public String eh(){
       return "FollowStaggerProxyFragment";
    }
}
