package old.soloader.MinElf;
import java.nio.channels.FileChannel;
import java.lang.String;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import old.soloader.MinElf$ElfError;
import java.lang.StringBuilder;
import java.nio.Buffer;

public final class MinElf	// class@002003
{

    public static String[] a(FileChannel p0){
       int i3;
       long l7;
       long l8;
       long l10;
       int i5;
       long l11;
       FileChannel uFileChannel = p0;
       ByteBuffer uByteBuffer = ByteBuffer.allocate(8);
       uByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
       if (MinElf.d(uFileChannel, uByteBuffer, 0) - 0x464c457f) {
          throw new MinElf$ElfError("file is not ELF");
       }
       int i = 1;
       if (MinElf.e(uFileChannel, uByteBuffer, 4) != i) {
          i = 0;
       }
       if (MinElf.e(uFileChannel, uByteBuffer, 5) == 2) {
          uByteBuffer.order(ByteOrder.BIG_ENDIAN);
       }
       long l = 28;
       long l1 = 32;
       long l2 = (i)? MinElf.d(uFileChannel, uByteBuffer, l): MinElf.b(uFileChannel, uByteBuffer, l1);
       long l3 = 44;
       long l4 = (i)? (long)MinElf.c(uFileChannel, uByteBuffer, l3): (long)MinElf.c(uFileChannel, uByteBuffer, 56);
       int i1 = (i)? MinElf.c(uFileChannel, uByteBuffer, 42): MinElf.c(uFileChannel, uByteBuffer, 54);
       l3 = 40;
       if (!l4 - 0xffff) {
          long l5 = (i)? MinElf.d(uFileChannel, uByteBuffer, l1): MinElf.b(uFileChannel, uByteBuffer, l3);
          l5 = (i)? MinElf.d(uFileChannel, uByteBuffer, (l5 + l)): MinElf.d(uFileChannel, uByteBuffer, (l5 + 44));
          l4 = l5;
       }
       l1 = l2;
       l = 0;
       while (true) {
          if (l - l4 < 0) {
             if (i) {
                l3 = l1 + 0;
                l3 = MinElf.d(uFileChannel, uByteBuffer, l3);
             }else {
                l3 = l1 + 0;
                l3 = MinElf.d(uFileChannel, uByteBuffer, l3);
             }
             if (!l3 - 2) {
                if (i) {
                   l3 = MinElf.d(uFileChannel, uByteBuffer, (l1 + 4));
                label_00c4 :
                   long l6 = 0;
                   if (l3 - l6) {
                      l1 = l3;
                      l = l6;
                      int i2 = 0;
                      while (true) {
                         if (i) {
                            i3 = i;
                            l7 = l1 + l6;
                            l7 = MinElf.d(uFileChannel, uByteBuffer, l7);
                         label_00e1 :
                            if (!l7 - 1) {
                               l8 = l3;
                               if (i2 != Integer.MAX_VALUE) {
                                  i2 = i2 + 1;
                               }else {
                                  throw new MinElf$ElfError("malformed DT_NEEDED section");
                               }
                            }else {
                               l8 = l3;
                               if (!l7 - 5) {
                                  if (i3) {
                                     l3 = l1 + 4;
                                     l3 = MinElf.d(uFileChannel, uByteBuffer, l3);
                                  }else {
                                     l3 = l1 + 8;
                                     l3 = MinElf.b(uFileChannel, uByteBuffer, l3);
                                  }
                                  l = l3;
                               }
                            }
                            l3 = 16;
                            long l9 = (i3)? 8: l3;
                            l1 = l1 + l9;
                            l6 = 0;
                            if (!l7 - l6) {
                               if (l - l6) {
                                  short i4 = 0;
                                  while (true) {
                                     if ((long)i4 - l4 < 0) {
                                        if (i3) {
                                           l1 = l2 + l6;
                                           l1 = MinElf.d(uFileChannel, uByteBuffer, l1);
                                        }else {
                                           l1 = l2 + l6;
                                           l1 = MinElf.d(uFileChannel, uByteBuffer, l1);
                                        }
                                        if (!l1 - 1) {
                                           if (i3) {
                                              l1 = l2 + 8;
                                              l1 = MinElf.d(uFileChannel, uByteBuffer, l1);
                                           }else {
                                              l1 = l2 + l3;
                                              l1 = MinElf.b(uFileChannel, uByteBuffer, l1);
                                           }
                                           if (i3) {
                                              l3 = l2 + 20;
                                              l10 = l4;
                                              l4 = MinElf.d(uFileChannel, uByteBuffer, l3);
                                              i = 40;
                                           }else {
                                              l10 = l4;
                                              l4 = l2 + 40;
                                              l4 = MinElf.b(uFileChannel, uByteBuffer, l4);
                                           }
                                           if (l1 - l <= 0) {
                                              l4 = l4 + l1;
                                              if (l - l4 < 0) {
                                                 l4 = (i3)? MinElf.d(uFileChannel, uByteBuffer, (l2 + 4)): MinElf.b(uFileChannel, uByteBuffer, (l2 + 8));
                                                 l4 = l4 + (l - l1);
                                              label_0196 :
                                                 l7 = 0;
                                                 if (l4 - l7) {
                                                    String[] stringArray = new String[i2];
                                                    i5 = 0;
                                                    while (true) {
                                                       if (i3) {
                                                          l11 = l8 + l7;
                                                          l11 = MinElf.d(uFileChannel, uByteBuffer, l11);
                                                       label_01ae :
                                                          if (!l11 - 1) {
                                                             if (i3) {
                                                                l7 = l8 + 4;
                                                                l7 = MinElf.d(uFileChannel, uByteBuffer, l7);
                                                             }else {
                                                                l7 = l8 + 8;
                                                                l7 = MinElf.b(uFileChannel, uByteBuffer, l7);
                                                             }
                                                             l7 = l7 + l4;
                                                             StringBuilder str = "";
                                                             l1 = l7 + 1;
                                                             i4 = MinElf.e(uFileChannel, uByteBuffer, l7);
                                                             while (i4) {
                                                                str = str+(char)i4;
                                                                l7 = l1;
                                                             }
                                                             stringArray[i5] = str;
                                                             if (i5 != Integer.MAX_VALUE) {
                                                                i5 = i5 + 1;
                                                             }else {
                                                                throw new MinElf$ElfError("malformed DT_NEEDED section");
                                                             }
                                                          }else {
                                                             long l13 = 4;
                                                          }
                                                          long l12 = (i3)? 8: 16;
                                                          l8 = l8 + l12;
                                                          if (!l11) {
                                                             if (i5 == i2) {
                                                                break ;
                                                             }else {
                                                                throw new MinElf$ElfError("malformed DT_NEEDED section");
                                                             }
                                                          }else {
                                                             l7 = 0;
                                                          }
                                                       }else {
                                                          l11 = l8 + l7;
                                                          l11 = MinElf.b(uFileChannel, uByteBuffer, l11);
                                                          goto label_01ae ;
                                                       }
                                                    }
                                                    return stringArray;
                                                 }else {
                                                    throw new MinElf$ElfError("did not find file offset of DT_STRTAB table");
                                                 }
                                              }
                                           }
                                        }else {
                                           l10 = l4;
                                           i = 40;
                                        }
                                        l2 = l2 + (long)i1;
                                        i4 = i4 + 1;
                                        l4 = l10;
                                        l3 = 16;
                                        l6 = 0;
                                     }else {
                                        l4 = 0;
                                        goto label_0196 ;
                                     }
                                  }
                               }else {
                                  throw new MinElf$ElfError("Dynamic section string-table not found");
                               }
                            }else {
                               i = i3;
                               l3 = l8;
                            }
                         }else {
                            i3 = i;
                            l7 = l1 + l6;
                            l7 = MinElf.b(uFileChannel, uByteBuffer, l7);
                            goto label_00e1 ;
                         }
                      }
                   }else {
                      throw new MinElf$ElfError("ELF file does not contain dynamic linking information");
                   }
                }else {
                   l3 = MinElf.b(uFileChannel, uByteBuffer, (l1 + 8));
                   goto label_00c4 ;
                }
             }else {
                l1 = l1 + (long)i1;
                l = l + 1;
                l3 = 40;
             }
          }else {
             i5 = 0;
             goto label_00c4 ;
          }
       }
    }
    public static long b(FileChannel p0,ByteBuffer p1,long p2){
       MinElf.f(p0, p1, 8, p2);
       return p1.getLong();
    }
    public static int c(FileChannel p0,ByteBuffer p1,long p2){
       MinElf.f(p0, p1, 2, p2);
       return (p1.getShort() & 0xffff);
    }
    public static long d(FileChannel p0,ByteBuffer p1,long p2){
       MinElf.f(p0, p1, 4, p2);
       return ((long)p1.getInt() & 0xffffffff);
    }
    public static short e(FileChannel p0,ByteBuffer p1,long p2){
       MinElf.f(p0, p1, 1, p2);
       return (short)(p1.get() & 0x00ff);
    }
    public static void f(FileChannel p0,ByteBuffer p1,int p2,long p3){
       p1.position(0);
       p1.limit(p2);
       while (p1.remaining() > 0) {
          p2 = p0.read(p1, p3);
          if (p2 == -1) {
             break ;
          }else {
             p3 = p3 + (long)p2;
          }
       }
       if (p1.remaining() > 0) {
          throw new MinElf$ElfError("ELF file truncated");
       }
       p1.position(0);
       return;
    }
}
