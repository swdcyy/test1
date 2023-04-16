package com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;

public class WorkspaceConstructor$a	// class@000d3c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Workspace$Type.values().length];
       try{
          WorkspaceConstructor$a.a = ointArray;
          ointArray[Workspace$Type.VIDEO.ordinal()] = 1;
          try{
             WorkspaceConstructor$a.a[Workspace$Type.KTV_MV.ordinal()] = 2;
             try{
                WorkspaceConstructor$a.a[Workspace$Type.KTV_SONG.ordinal()] = 3;
                try{
                   WorkspaceConstructor$a.a[Workspace$Type.LONG_VIDEO.ordinal()] = 4;
                   try{
                      WorkspaceConstructor$a.a[Workspace$Type.ALBUM_MOVIE.ordinal()] = 5;
                      try{
                         WorkspaceConstructor$a.a[Workspace$Type.PHOTO_MOVIE.ordinal()] = 6;
                         try{
                            WorkspaceConstructor$a.a[Workspace$Type.KUAISHAN.ordinal()] = 7;
                            try{
                               WorkspaceConstructor$a.a[Workspace$Type.SINGLE_PICTURE.ordinal()] = 8;
                               try{
                                  WorkspaceConstructor$a.a[Workspace$Type.ATLAS.ordinal()] = 9;
                                  try{
                                     WorkspaceConstructor$a.a[Workspace$Type.LONG_PICTURE.ordinal()] = 10;
                                     try{
                                        WorkspaceConstructor$a.a[Workspace$Type.UNKNOWN.ordinal()] = 11;
                                        try{
                                           WorkspaceConstructor$a.a[Workspace$Type.UNRECOGNIZED.ordinal()] = 12;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
