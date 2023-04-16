package a46.d;
import lnc.x6;
import com.kwai.framework.init.a;
import com.kuaishou.android.model.music.Music;
import brd.t;
import t16.a;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.music.data.MusicSource;
import d46.c;
import d46.b;
import java.util.List;
import d46.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import java.lang.String;
import k2b.e0;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;

public interface abstract d implements x6	// class@000026
{

    a E6();
    t EG(int p0,Music p1);
    void EM(a p0,Music p1);
    Intent I8(Context p0);
    void OF(GifshowActivity p0,Music p1,MusicSource p2,long p3,long p4,boolean p5,boolean p6,c p7);
    void Wj(GifshowActivity p0,Music p1,MusicSource p2,b p3,boolean p4,boolean p5);
    t el(List p0);
    d hN();
    void mU(BaseFragment p0,int p1,SearchMusicPanelInteraction p2,int p3,String p4,int p5,e0 p6);
    void n40();
    void o3(String p0);
    CloudMusicHelper px();
}
