�    ������ salc test file 

 00401016     B8 00000000    MOV EAX,0  ; init eax
0040101B     F9             STC        ; set carry flag
0040101C     D6             SALC       ; this will put 0xFF in AL
0040101D     F8             CLC        ; clear carry flag
0040101E     D6             SALC       ; this will put 0x00 in AL
0       