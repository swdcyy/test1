package com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin;
import tkd.b;
import java.util.ArrayList;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$a;
import androidx.fragment.app.FragmentActivity;
import wq6.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$UserGrowthLoginConfig;
import java.lang.String;

public interface abstract GrowthUserLoginPlugin implements b	// class@000fc4
{

    boolean BH();
    boolean Ck();
    void Cs(ArrayList p0);
    void H8(GrowthUserLoginPlugin$a p0);
    void HA(FragmentActivity p0,int p1,GrowthUserLoginPlugin$a p2);
    ArrayList RA();
    PresenterV2 RG(l p0);
    boolean SD(GrowthUserLoginPlugin$a p0);
    void U10(boolean p0);
    boolean hH();
    void iN(GrowthUserLoginPlugin$UserGrowthLoginConfig p0);
    boolean or(int p0);
    void pG(GrowthUserLoginPlugin$a p0);
    void sI();
    PresenterV2 uE(String p0,int p1);
    GrowthUserLoginPlugin$UserGrowthLoginConfig uT();
}
