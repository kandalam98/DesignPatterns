package org.example.Singelton;

class Singelton {

    private static Singelton application;

    public static Singelton getInstance(){
        if(application == null){
            synchronized (Singelton.class){
                if(application == null ){
                    application = new Singelton();
                }
            }
        }
        return application;
    }
    /**to make it sync we can use syncronized use above code
     * in multi threaded environment
     *     public static Singelton getInstance(){
     *         if(application == null ){
     *
     *             application = new Singelton();
     *         }
     *         return application;
     *     }
     * */

}
