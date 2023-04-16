package com.kuaishou.socket.nano.SocketMessages$SocketMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import java.lang.Object;
import java.lang.String;

public final class SocketMessages$SocketMessage extends MessageNano	// class@000f4d
{
    public byte[] ackInfo;
    public int compressionType;
    public String messageId;
    public boolean needAck;
    public byte[] payload;
    public int payloadType;
    public String reportId;
    public long time;
    public static SocketMessages$SocketMessage[] _emptyArray;

    public void SocketMessages$SocketMessage(){
       super();
       this.clear();
    }
    public static SocketMessages$SocketMessage[] emptyArray(){
       if (SocketMessages$SocketMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SocketMessage._emptyArray == null) {
             SocketMessages$SocketMessage[] socketMessag = new SocketMessages$SocketMessage[0];
             SocketMessages$SocketMessage._emptyArray = socketMessag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SocketMessage._emptyArray;
    }
    public static SocketMessages$SocketMessage parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SocketMessage().mergeFrom(p0);
    }
    public static SocketMessages$SocketMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SocketMessage(), p0);
    }
    public SocketMessages$SocketMessage clear(){
       this.payloadType = 0;
       this.compressionType = 0;
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       this.payload = eMPTY_BYTES;
       this.time = 0;
       this.reportId = "";
       this.messageId = "";
       this.needAck = false;
       this.ackInfo = eMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$SocketMessage tpayloadType = this.payloadType;
       if (tpayloadType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpayloadType);
       }
       tpayloadType = this.compressionType;
       if (tpayloadType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tpayloadType);
       }
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       if (!Arrays.equals(this.payload, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.payload);
       }
       SocketMessages$SocketMessage ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       String str = "";
       if (!(this.reportId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.reportId);
       }
       if (!(this.messageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.messageId);
       }
       tpayloadType = this.needAck;
       if (tpayloadType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tpayloadType);
       }
       if (!Arrays.equals(this.ackInfo, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(8, this.ackInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SocketMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.ackInfo = p0.readBytes();
                               }
                            }else {
                               this.needAck = p0.readBool();
                            }
                         }else {
                            this.messageId = p0.readString();
                         }
                      }else {
                         this.reportId = p0.readString();
                      }
                   }else {
                      this.time = p0.readUInt64();
                   }
                }else {
                   this.payload = p0.readBytes();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.compressionType = i;
                }
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 3:
                 case 4:
                 case '3':
                 case 'e':
                 case 'f':
                 case 'g':
                 case 'h':
                 case 'i':
                 case 200:
                 case 201:
                 case 202:
                 case 203:
                 case 204:
                 case 205:
                 case 206:
                 case 207:
                 case 300:
                 case 301:
                 case 302:
                 case 303:
                 case 304:
                 case 305:
                 case 306:
                 case 307:
                 case 308:
                 case 310:
                 case 311:
                 case 312:
                 case 320:
                 case 321:
                 case 322:
                 case 323:
                 case 324:
                 case 325:
                 case 326:
                 case 327:
                 case 328:
                 case 329:
                 case 330:
                 case 331:
                 case 340:
                 case 350:
                 case 351:
                 case 352:
                 case 353:
                 case 354:
                 case 355:
                 case 356:
                 case 357:
                 case 360:
                 case 361:
                 case 362:
                 case 363:
                 case 370:
                 case 371:
                 case 380:
                 case 381:
                 case 382:
                 case 383:
                 case 384:
                 case 385:
                 case 386:
                 case 387:
                 case 388:
                 case 389:
                 case 390:
                 case 391:
                 case 399:
                 case 400:
                 case 401:
                 case 402:
                 case 403:
                 case 410:
                 case 411:
                 case 412:
                 case 414:
                 case 415:
                 case 416:
                 case 417:
                 case 418:
                 case 419:
                 case 420:
                 case 421:
                 case 422:
                 case 423:
                 case 424:
                 case 425:
                 case 426:
                 case 427:
                 case 430:
                 case 431:
                 case 432:
                 case 433:
                 case 434:
                 case 435:
                 case 436:
                 case 437:
                 case 438:
                 case 439:
                 case 440:
                 case 441:
                 case 442:
                 case 460:
                 case 461:
                 case 462:
                 case 463:
                 case 470:
                 case 471:
                 case 472:
                 case 474:
                 case 475:
                 case 476:
                 case 477:
                 case 478:
                 case 479:
                 case 480:
                 case 481:
                 case 482:
                 case 483:
                 case 490:
                 case 491:
                 case 500:
                 case 501:
                 case 510:
                 case 511:
                 case 521:
                 case 522:
                 case 531:
                 case 532:
                 case 533:
                 case 541:
                 case 542:
                 case 550:
                 case 551:
                 case 552:
                 case 553:
                 case 560:
                 case 561:
                 case 562:
                 case 565:
                 case 570:
                 case 571:
                 case 581:
                 case 582:
                 case 583:
                 case 584:
                 case 585:
                 case 586:
                 case 587:
                 case 588:
                 case 590:
                 case 591:
                 case 592:
                 case 593:
                 case 594:
                 case 595:
                 case 596:
                 case 600:
                 case 601:
                 case 602:
                 case 603:
                 case 604:
                 case 605:
                 case 606:
                 case 607:
                 case 608:
                 case 610:
                 case 611:
                 case 612:
                 case 613:
                 case 614:
                 case 615:
                 case 616:
                 case 617:
                 case 620:
                 case 621:
                 case 622:
                 case 623:
                 case 630:
                 case 631:
                 case 632:
                 case 633:
                 case 634:
                 case 641:
                 case 642:
                 case 643:
                 case 644:
                 case 645:
                 case 646:
                 case 647:
                 case 648:
                 case 649:
                 case 650:
                 case 651:
                 case 652:
                 case 653:
                 case 654:
                 case 655:
                 case 656:
                 case 657:
                 case 660:
                 case 661:
                 case 662:
                 case 663:
                 case 664:
                 case 665:
                 case 666:
                 case 667:
                 case 670:
                 case 671:
                 case 672:
                 case 673:
                 case 674:
                 case 675:
                 case 676:
                 case 677:
                 case 678:
                 case 679:
                 case 680:
                 case 681:
                 case 682:
                 case 683:
                 case 684:
                 case 685:
                 case 686:
                 case 687:
                 case 688:
                 case 689:
                 case 690:
                 case 691:
                 case 692:
                 case 693:
                 case 694:
                 case 695:
                 case 696:
                 case 697:
                 case 698:
                 case 699:
                 case 700:
                 case 701:
                 case 702:
                 case 703:
                 case 704:
                 case 705:
                 case 706:
                 case 707:
                 case 708:
                 case 709:
                 case 710:
                 case 711:
                 case 712:
                 case 713:
                 case 714:
                 case 715:
                 case 716:
                 case 717:
                 case 718:
                 case 719:
                 case 720:
                 case 721:
                 case 722:
                 case 723:
                 case 727:
                 case 728:
                 case 729:
                 case 730:
                 case 731:
                 case 732:
                 case 733:
                 case 734:
                 case 735:
                 case 736:
                 case 737:
                 case 738:
                 case 739:
                 case 740:
                 case 741:
                 case 742:
                 case 743:
                 case 744:
                 case 745:
                 case 746:
                 case 747:
                 case 748:
                 case 749:
                 case 750:
                 case 751:
                 case 752:
                 case 753:
                 case 754:
                 case 755:
                 case 756:
                 case 757:
                 case 758:
                 case 759:
                 case 760:
                 case 761:
                 case 762:
                 case 763:
                 case 764:
                 case 765:
                 case 766:
                 case 767:
                 case 768:
                 case 770:
                 case 771:
                 case 772:
                 case 773:
                 case 774:
                 case 775:
                 case 776:
                 case 777:
                 case 778:
                 case 779:
                 case 780:
                 case 781:
                 case 782:
                 case 785:
                 case 786:
                 case 787:
                 case 788:
                 case 789:
                 case 790:
                 case 791:
                 case 792:
                 case 794:
                 case 795:
                 case 796:
                 case 797:
                 case 798:
                 case 799:
                 case 800:
                 case 801:
                 case 803:
                 case 804:
                 case 805:
                 case 806:
                 case 807:
                 case 808:
                 case 809:
                 case 810:
                 case 811:
                 case 812:
                 case 813:
                 case 814:
                 case 815:
                 case 816:
                 case 817:
                 case 818:
                 case 819:
                 case 820:
                 case 821:
                 case 822:
                 case 823:
                 case 824:
                 case 825:
                 case 826:
                 case 827:
                 case 828:
                 case 829:
                 case 830:
                 case 831:
                 case 832:
                 case 833:
                 case 834:
                 case 835:
                 case 836:
                 case 837:
                 case 838:
                 case 839:
                 case 840:
                 case 841:
                 case 842:
                 case 843:
                 case 844:
                 case 845:
                 case 846:
                 case 847:
                 case 848:
                 case 849:
                 case 850:
                 case 851:
                 case 852:
                 case 853:
                 case 854:
                 case 856:
                 case 857:
                 case 858:
                 case 859:
                 case 860:
                 case 861:
                 case 862:
                 case 863:
                 case 864:
                 case 865:
                 case 866:
                 case 867:
                 case 868:
                 case 869:
                 case 870:
                 case 871:
                 case 872:
                 case 873:
                 case 874:
                 case 875:
                 case 876:
                 case 877:
                 case 878:
                 case 879:
                 case 880:
                 case 881:
                 case 882:
                 case 883:
                 case 884:
                 case 885:
                 case 886:
                 case 887:
                 case 888:
                 case 889:
                 case 890:
                 case 891:
                 case 892:
                 case 893:
                 case 894:
                 case 900:
                 case 901:
                 case 902:
                 case 903:
                 case 904:
                 case 905:
                 case 906:
                 case 907:
                 case 908:
                 case 909:
                 case 911:
                 case 912:
                 case 913:
                 case 914:
                 case 915:
                 case 916:
                 case 917:
                 case 918:
                 case 919:
                 case 920:
                 case 921:
                 case 922:
                 case 923:
                 case 924:
                 case 925:
                 case 926:
                 case 927:
                 case 928:
                 case 929:
                 case 930:
                 case 931:
                 case 932:
                 case 933:
                 case 934:
                 case 935:
                 case 936:
                 case 937:
                 case 938:
                 case 939:
                 case 940:
                 case 941:
                 case 942:
                 case 943:
                 case 944:
                 case 945:
                 case 946:
                 case 947:
                 case 948:
                 case 949:
                 case 950:
                 case 951:
                 case 953:
                 case 954:
                 case 955:
                 case 956:
                 case 957:
                 case 958:
                 case 959:
                 case 960:
                 case 961:
                 case 962:
                 case 963:
                 case 964:
                 case 965:
                 case 966:
                 case 967:
                 case 968:
                 case 969:
                 case 970:
                 case 971:
                 case 972:
                 case 973:
                 case 974:
                 case 975:
                 case 976:
                 case 977:
                 case 978:
                 case 979:
                 case 980:
                 case 981:
                 case 982:
                 case 983:
                 case 984:
                 case 985:
                 case 986:
                 case 987:
                 case 988:
                 case 989:
                 case 990:
                 case 991:
                 case 992:
                 case 993:
                 case 994:
                 case 995:
                 case 996:
                 case 997:
                 case 998:
                 case 999:
                 case 1000:
                 case 1001:
                 case 1002:
                 case 1003:
                 case 1004:
                 case 1005:
                 case 1006:
                 case 1007:
                 case 1008:
                 case 1009:
                 case 1010:
                 case 1011:
                 case 1012:
                 case 1013:
                 case 1014:
                 case 1015:
                 case 1016:
                 case 1017:
                 case 1018:
                 case 1019:
                 case 1020:
                 case 1021:
                 case 1022:
                 case 1023:
                 case 1024:
                 case 1025:
                 case 1026:
                 case 1027:
                 case 1028:
                 case 1029:
                 case 1030:
                 case 1031:
                 case 1032:
                 case 1033:
                 case 1034:
                 case 1035:
                 case 1036:
                 case 1037:
                 case 1038:
                 case 1039:
                 case 1040:
                 case 1041:
                 case 1042:
                 case 1043:
                 case 1044:
                 case 1045:
                 case 1046:
                 case 1047:
                 case 1048:
                 case 1049:
                 case 1050:
                 case 1051:
                 case 1052:
                 case 1053:
                 case 1054:
                 case 1055:
                 case 1056:
                 case 1057:
                 case 1058:
                 case 1059:
                 case 1060:
                 case 1061:
                 case 1062:
                 case 1063:
                 case 1064:
                 case 1065:
                 case 1066:
                 case 1067:
                 case 1068:
                 case 1069:
                 case 1070:
                 case 1071:
                 case 1072:
                 case 1073:
                 case 1074:
                 case 1075:
                 case 1076:
                 case 1077:
                 case 1078:
                 case 1079:
                 case 1080:
                 case 1081:
                 case 1082:
                 case 1083:
                 case 1084:
                 case 1085:
                 case 1086:
                 case 1087:
                 case 1088:
                 case 1089:
                 case 1090:
                 case 1091:
                 case 1092:
                 case 1093:
                 case 1094:
                 case 1095:
                 case 1096:
                 case 1097:
                 case 1098:
                 case 1099:
                 case 1100:
                 case 1101:
                 case 1102:
                 case 1103:
                 case 1104:
                 case 1105:
                 case 1106:
                 case 1:
                   break;
                 default:
             }
             this.payloadType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SocketMessages$SocketMessage tpayloadType = this.payloadType;
       if (tpayloadType != null) {
          p0.writeInt32(1, tpayloadType);
       }
       tpayloadType = this.compressionType;
       if (tpayloadType != null) {
          p0.writeInt32(2, tpayloadType);
       }
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       if (!Arrays.equals(this.payload, eMPTY_BYTES)) {
          p0.writeBytes(3, this.payload);
       }
       SocketMessages$SocketMessage ttime = this.time;
       if (ttime) {
          p0.writeUInt64(4, ttime);
       }
       String str = "";
       if (!(this.reportId).equals(str)) {
          p0.writeString(5, this.reportId);
       }
       if (!(this.messageId).equals(str)) {
          p0.writeString(6, this.messageId);
       }
       tpayloadType = this.needAck;
       if (tpayloadType != null) {
          p0.writeBool(7, tpayloadType);
       }
       if (!Arrays.equals(this.ackInfo, eMPTY_BYTES)) {
          p0.writeBytes(8, this.ackInfo);
       }
       super.writeTo(p0);
       return;
    }
}
