package com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKMvpTopScoreUserView;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserView$TopScoreUserListAnchor;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserItem;
import com.kwai.framework.model.user.UserInfo;

public class GameInteractivePKMvpTopScoreUserView extends LivePkMvpTopScoreUserView	// class@001bf1
{

    public void GameInteractivePKMvpTopScoreUserView(Context p0){
       super(p0);
    }
    public void GameInteractivePKMvpTopScoreUserView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GameInteractivePKMvpTopScoreUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setTopScoreUserData(List p0){
       LivePkMvpTopScoreUserItem livePkMvpTop;
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractivePKMvpTopScoreUserView.class, "1")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          LivePkMvpTopScoreUserView tb = this.b;
          if (tb != null) {
             tb.setVisibility(8);
          }
          int i = 0;
          while (i < 3) {
             LivePkMvpTopScoreUserView$TopScoreUserListAnchor sELF = LivePkMvpTopScoreUserView$TopScoreUserListAnchor.SELF;
             int i1 = 1;
             if (this.d == sELF) {
                livePkMvpTop = this.c.get(i);
             }else {
                i2 = i - 3;
                i2 = i2 - i1;
                livePkMvpTop = this.c.get(i2);
             }
             if (livePkMvpTop != null) {
                i2 = p0.size() - i1;
                if (i > i2) {
                   livePkMvpTop.a();
                }else if(p0.get(i) != null){
                   UserInfo userInfo = p0.get(i);
                   if (this.d != sELF) {
                      i1 = false;
                   }
                   livePkMvpTop.b(userInfo, i1);
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
