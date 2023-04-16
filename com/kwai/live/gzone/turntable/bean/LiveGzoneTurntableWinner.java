package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableWinner;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import com.kwai.framework.model.user.User;

public class LiveGzoneTurntableWinner implements Serializable	// class@000e3e
{
    public LiveGzoneTurntablePrize mPrize;
    public User mUser;
    public static final long serialVersionUID = 0xf406805ba699818f;

    public void LiveGzoneTurntableWinner(){
       super();
    }
    public void LiveGzoneTurntableWinner(LiveGzoneTurntablePrize p0,User p1){
       super();
       this.mPrize = p0;
       this.mUser = p1;
    }
}
