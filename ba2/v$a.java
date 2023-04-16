package ba2.v$a;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import java.lang.Enum;

public class v$a	// class@0003af
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveHourlyRankType.values().length];
       try{
          v$a.a = ointArray;
          ointArray[LiveHourlyRankType.NATIONAL_RANK.ordinal()] = 1;
          try{
             v$a.a[LiveHourlyRankType.DISTRICT_RANK.ordinal()] = 2;
             try{
                v$a.a[LiveHourlyRankType.MERCHANT_RANK.ordinal()] = 3;
                try{
                   v$a.a[LiveHourlyRankType.POPULARITY_RANK.ordinal()] = 4;
                   try{
                      v$a.a[LiveHourlyRankType.GZONE_RANK.ordinal()] = 5;
                      try{
                         v$a.a[LiveHourlyRankType.HIGH_VALUE_RANK.ordinal()] = 6;
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
