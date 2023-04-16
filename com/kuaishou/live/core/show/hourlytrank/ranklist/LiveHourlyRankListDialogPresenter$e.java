package com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$e;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import java.lang.Enum;

public class LiveHourlyRankListDialogPresenter$e	// class@000c26
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveHourlyRankType.values().length];
       try{
          LiveHourlyRankListDialogPresenter$e.a = ointArray;
          ointArray[LiveHourlyRankType.DISTRICT_RANK.ordinal()] = 1;
          try{
             LiveHourlyRankListDialogPresenter$e.a[LiveHourlyRankType.HEADLINE_RANK.ordinal()] = 2;
             try{
                LiveHourlyRankListDialogPresenter$e.a[LiveHourlyRankType.GZONE_RANK.ordinal()] = 3;
                try{
                   LiveHourlyRankListDialogPresenter$e.a[LiveHourlyRankType.MERCHANT_RANK.ordinal()] = 4;
                   try{
                      LiveHourlyRankListDialogPresenter$e.a[LiveHourlyRankType.POPULARITY_RANK.ordinal()] = 5;
                      try{
                         LiveHourlyRankListDialogPresenter$e.a[LiveHourlyRankType.HIGH_VALUE_RANK.ordinal()] = 6;
                         try{
                            LiveHourlyRankListDialogPresenter$e.a[LiveHourlyRankType.CITY_RANK.ordinal()] = 7;
                            try{
                               LiveHourlyRankListDialogPresenter$e.a[LiveHourlyRankType.NATIONAL_RANK.ordinal()] = 8;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
