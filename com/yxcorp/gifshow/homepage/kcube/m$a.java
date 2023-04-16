package com.yxcorp.gifshow.homepage.kcube.m$a;
import zr6.b;
import java.lang.Object;
import java.util.List;
import zq6.q;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bo5.a;
import com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import zq6.p;
import un5.b;
import wn5.a;
import zr6.j;
import wq6.h;
import wn5.b;
import rn5.a;
import uv8.m1;
import zf6.l;
import java.lang.Boolean;
import psa.d0;
import msd.a;
import psa.c0;
import tkd.b;
import tkd.d;
import hn5.d;
import sn5.a;
import gsa.e0;
import ro5.b;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.channel.HotChannel;
import hn5.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.util.l;
import os5.l;
import android.os.Bundle;

public class m$a extends b	// class@00173e
{

    public void m$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m$a.class, "4")) {
          return;
       }
       p1.b(a.r, TopTabViewType.NORMAL);
       p1.b(b.e, new a("FIND", true));
       b uob = this.b.q("KEY_TAB_NAME_DEST");
       p1.b(a.n, uob);
       p1.b(a.s, uob);
       if (m1.d()) {
          p1.b(b.a, Boolean.valueOf(l.r()));
          p1.a(a.b, new d0(this, p2));
          p1.a(a.e, new c0(this, p2));
       }else {
          p1.b(b.a, Boolean.valueOf(l.r()));
          p1.b(a.b, d.a(-683509148).P4(p2, this.b));
          p1.b(a.e, b.a(this.b, p2));
       }
       return;
    }
    public Fragment c(FragmentActivity p0,h p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, m$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       HotChannel hotChannel = this.b.q("KEY_TAB_HOT_CHANNEL");
       BaseFragment uBaseFragmen = PatchProxy.applyTwoRefs(hotChannel, p1, this, m$a.class, "2");
       if (uBaseFragmen != PatchProxyResult.class) {
       }else if(hotChannel.isH5()){
          uBaseFragmen = d.a(-1504577665).Lo();
          l.a(uBaseFragmen);
       }else {
          int i = -1492894991;
          if (hotChannel.mIsLive != null || (!(hotChannel.mId).equalsIgnoreCase("29") || (d.a(i).er() || (hotChannel.mId).equalsIgnoreCase("50")))) {
             uBaseFragmen = d.a(i).Mg();
             l.a(uBaseFragmen);
          }else {
             uBaseFragmen = d.a(-1504577665).HM();
             l.a(uBaseFragmen);
          }
       }
       Bundle uBundle = PatchProxy.applyTwoRefs(hotChannel, p1, this, m$a.class, "3");
       if (uBundle != PatchProxyResult.class) {
       }else {
          uBundle = d.a(-1504577665).Sk(hotChannel);
       }
       if (uBundle != null) {
          uBaseFragmen.setArguments(uBundle);
       }
       return uBaseFragmen;
    }
}
