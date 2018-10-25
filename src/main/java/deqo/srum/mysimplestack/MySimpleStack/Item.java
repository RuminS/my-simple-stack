package deqo.srum.mysimplestack.MySimpleStack;

public class Item {
    private Object value;

    Item (Object value){
        setValue(value);
    }

    /**
     * Un commentaire répondant à l'exigence #1
     * @return
     */
    public Object getValue(){
        return value;
    }

    /**
     *Un commentaire répondant à l'exigence #2
     */
    public void setValue(Object value){
        this.value = value;
    }
}
