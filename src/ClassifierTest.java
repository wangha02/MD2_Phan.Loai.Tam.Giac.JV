import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifierTest {
    @Test
    void testTamGiacDeu(){
        double a = 2;
        double b = 2;
        double c = 2;
        String result = TriangleClassifier.triangleClassifier(a , b ,c );
        String kiVong = "no la tam giac deu";
        assertEquals(result,kiVong);
    }
    @Test
    void testTamGiacCan(){
        double a = 2;
        double b = 2;
        double c = 3;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String uocAo = "no la tam giac can";
        assertEquals(result,uocAo);
    }
    @Test
    void testTamGiacVuongCan(){
        double a = 3;
        double b = 3;
        double c = Math.sqrt(18) ;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String mongMuon = "no la tam giac vuong can";
        assertEquals(mongMuon,result);

    }
    @Test
    void testTamgiacVuong(){
        double a =3;
        double b = 4;
        double c = 5 ;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String khaoKhat = "no la tam giac vuong";
        assertEquals(result,khaoKhat);

    }
    @Test
    void testTamGiacThuong(){
        double a =5;
        double b =4;
        double c = 6;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String khaoKhat = "no la tam giac thuong";
        assertEquals(result,khaoKhat);

    }

}