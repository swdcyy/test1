package nfd.n1$b;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Enum;

public class n1$b	// class@001de3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SearchPage.values().length];
       try{
          n1$b.a = ointArray;
          ointArray[SearchPage.LIVE.ordinal()] = 1;
          try{
             n1$b.a[SearchPage.PHOTO.ordinal()] = 2;
             try{
                n1$b.a[SearchPage.ATLAS.ordinal()] = 3;
                try{
                   n1$b.a[SearchPage.COMMODITY.ordinal()] = 4;
                   try{
                      n1$b.a[SearchPage.USER.ordinal()] = 5;
                      try{
                         n1$b.a[SearchPage.MUSIC.ordinal()] = 6;
                         try{
                            n1$b.a[SearchPage.VERTICAL_TAG.ordinal()] = 7;
                            try{
                               n1$b.a[SearchPage.TAG.ordinal()] = 8;
                               try{
                                  n1$b.a[SearchPage.GROUP.ordinal()] = 9;
                                  try{
                                     n1$b.a[SearchPage.NEWEST.ordinal()] = 10;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
