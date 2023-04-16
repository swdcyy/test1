package my1.c;
import my1.e;
import iy1.l;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class c extends e	// class@00324f
{
    public LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank d;
    public int e;

    public void c(l p0,int p1,LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank p2){
       super(p0);
       this.e = 0;
       this.d = p2;
       this.e = p1;
    }
    public long a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.max(super.a(), 3000);
    }
}
