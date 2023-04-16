package com.kuaishou.live.gzone.treasurebox.presenter.f;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxListResponse;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;

public final class f implements o	// class@001c7f
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       Iterator iterator = p0.mLiveTreasureBoxModels.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          LiveTreasureBoxModel liveTreasure = iterator.next();
          if (i) {
             continue ;
          }else {
             LiveTreasureBoxModel$BoxStatus cOUNTING_DOW = LiveTreasureBoxModel$BoxStatus.COUNTING_DOWN;
             if (liveTreasure.getBoxStatus() != cOUNTING_DOW) {
                if (liveTreasure.getBoxStatus() == LiveTreasureBoxModel$BoxStatus.WAITING) {
                   liveTreasure.setBoxStatus(cOUNTING_DOW);
                }
             }
             i = 1;
          }
       }
       return p0;
    }
}
