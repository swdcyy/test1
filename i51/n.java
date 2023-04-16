package i51.n;
import erd.o;
import i51.o;
import com.kuaishou.android.live.model.Race;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveStreamRace;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.android.live.model.Round;
import com.kuaishou.protobuf.livestream.nano.Round;
import com.kuaishou.protobuf.livestream.nano.Network;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import f3b.k;
import ekd.p0;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.protobuf.nano.MessageNano;
import ekd.s;
import android.util.Base64;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.gson.Gson;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.t;

public final class n implements o	// class@00282f
{
    public final o b;
    public final Race c;
    public final int d;

    public void n(o p0,Race p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       boolean a;
       String str1;
       String str2;
       p0 = this.b;
       n tc = this.c;
       n td = this.d;
       Objects.requireNonNull(p0);
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          p0 = PatchProxy.applyTwoRefs(tc, Integer.valueOf(td), p0, oo, "6");
          if (p0 != PatchProxyResult.class) {
          label_00f2 :
             String str = Base64.encodeToString(s.b(MessageNano.toByteArray(p0)), 2);
             b.d0(LiveLogTag.LIVE_SOCKET, "horseRace liveRaceReport", "logSize", String.valueOf(str.length()), "raceStatistic", new Gson().q(p0));
             return t.just(str);
          }
       }
       p0 = new LiveStreamRace();
       int i = tc.mRounds.size();
       ArrayList uArrayList = new ArrayList();
       int i1 = 0;
       while (i1 < i) {
          Round round = tc.mRounds.get(i1);
          if (round.mStartTime) {
             uArrayList.add(round.toProto());
          }
          i1 = i1 + 1;
       }
       p0.startTime = tc.mStartTime;
       p0.cost = tc.mCost;
       p0.success = tc.mSuccess;
       p0.tag = tc.mTag;
       Round[] roundArray = new Round[uArrayList.size()];
       p0.round = uArrayList.toArray(roundArray);
       p0.reraceCount = (long)td;
       Network network = new Network();
       p0.network = network;
       network.type = k.b(a.a().a());
       LiveStreamRace network1 = p0.network;
       a.a().a();
       try{
          a = p0.a;
          str1 = b.q();
          str2 = b.r();
          if (TextUtils.isEmpty(str2)) {
             if (str1 != null) {
                if (!str1.equals("46000") && (str1.equals("46002") || str1.equals("46007"))) {
                   str1 = "中国移动";
                }else if(str1.equals("46001") || str1.equals("46009")){
                   str1 = "中国联通";
                }else if(str1.equals("46003")){
                   str1 = "中国电信";
                }
             }else {
                str1 = "";
             }
          }
          e0.isp = str2;
          p0.network.bssid = p0.l(a.a().a());
          goto label_00f2 ;
       }catch(java.lang.Exception e0){
       }
       str2 = str1;
       goto label_00e0 ;
    }
}
