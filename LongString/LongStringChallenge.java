import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

    /**
     * Challenge
     * 
     * Sort the String containing the characters a-z including _
     * 
     * by the number of times the character appears in the text (Descending)
     * 
     * take the sorted String, and drop all the character after (and including) the_.
     * The remaining word is the answer.
     * 
     **/
     
     /**
      * Here is an example for testing
      * "cwrxwzbgickpjbp_svnudntddwdqbfgzyiqpuxddmpvyfquosmicfzkjekxzchngpqaksafulateukuwomdrwza_n_ptzktjzcuibnebe_tqessrzqewgkadrkvtyznaupodanwazopg_fijcoojojbsolr_ejesukzc_quochdnmti_lkvrsegyieqlqysuxdvetkqtkhxaiypfdiddztlicjurnllriopdtuuzpryrsepfydyeg_xkr_ruxp_lgqesysidfsygztwrba_ay_gaqqklbrvr_lbhawjraqujfxptmuvqfzklfodgaqrnhjravksjwemoosdlxtvw_qspxmlvqryusfixzlkb_p_c_tepzozzwnokvqspkizygoqpbhjnsxopchzgapctowbrletrunlgnvzpfwrqgedo_s_ygkxz_mpncnve_gfpbotupawevhfxvqhwlerupjfibosbvhiijrodigzyhy_iijes_xsqorshhdzkjqitpljsftpitjetwmzqiabyiewgtbjaddtsjkckcxxvlyrchloetluxkohn_uihkdjpcqgvejanslakmwendgkmvmayknvjjnr_kdapnumwvz__lsimxdtrflyleykxejl_jbkhexpcyreoapelqzzyriyrbxdgbgwrrxlj_pt_mpwubvbveakxfsbfgj___xfqilxpzalazduzucgoxz_yzhkjwamosiwclkicifmebonobknqokyevtwmekackk_kezmjkgmtgaouerwlwfkaaqhkghreoqhfjzpxrlzmbgfpvofpxkmz_cnvcvfsuokpcaimnvdxeizbbgudln__wvkrqpijlncdacmsvytdxmu_zkvzilfrymoxzlovfhdzuarqumibrcvuqfcxdcrvw_ehbwhwjoanluezhthzkpuqd_efilprbskomczdhdoyudx_sybyfuako_xmorjtdnvwlwskpxnhjhmamiyxbyhh_reqlnkbzmrn_oleixht_v_tigjuxpkmmdpxznvbeqdzuedlfywxmcrbttdp_nfzusrrvpttbtabticgdx_cdiookdmupufqhlwiidaveibsyrviqsyvgledamchipkibjftdedyxzqjgvyyrcgwopo_vmldkrzhlatforljbeeqvgonrradkgmzin_mjbareajhewvyiidczysmrmzppgiifvqecxixbtukignqzr_pzokiedmwsw_usamiqngdiolwahtkbyhob_xpvmkdvqbvywmmtogfjogumfom_ppfut_cnxnjwjeiuidnapodo_wiqvgluofjatvkwowosn_vbmdsrwkhbnmlwctcrb_ycyklnxsbhbjkpknlfsccburlfhjhteqnnwrcfonrqifiapfeqqbv_d_rgddzqkjt_eeinwww_oxropsvcpuignzzudsjugxghobkurukspjygbowcic_rmuaatueajsbdswcwnhjaoujs_nbcmmrfjqoqchrvgehdewpicqanwilpirqghzkklsfczavcegoqdflxqamzsppfozsmrmmrzjlfrbxcljdmvxeaxnifyjluwfnqdzmwzepzzxmbyev_ms_flxgevtmyiqifnrsclobraupspnpndekgyxhlkyhuaahgonahtcmhim_ufoevtvemqffnmpgqmxqatvamwaqvogmdottva__yhjbuvco_wytdxssnbqrlqlvcaltxwfaej_ycvlcdqzwxphhwxitcvrpzcdrmmfancifskzzpltgpyskiqpcqiwsufibt_pvquhqadcllygxcshnbrudltm_pkjyfnolo_wqdwhbwpuvduuodtkfhqqzmvjfhvsfdhyi_fkhuspwvqiaestpgkqelgo_lnmmodlmfmyggpizxbjautpleio_zalvo_ryrymndvnzqyermzsrycngihghtampsdpidttqdmqo_iwieomfruotxfduawlrxsbuoncjmqehmtiyqzbilxloywkmtrbvmg__fxczgkcxecgjobcfenwztzivnfwijcmjlqcqcxdkozmjbmfxxuwlawcinh_lbzmepageirjmszxlwfqiaeisrfnuxpiexsgpjo_hvaojqyzqrkdohewbeipbvbqmefftjixqrnzrufbc_ombxljpmiedfnra_ugpnispsrrsuoeckawzsdfvwlgmwxub_hpccvlbwyyyqcxdcsl_f_vwvsgzptetyyjuemsnpkpcgdlxkuyyljhcquwrivsvuhbwvhf_jtgnvvlqpgufpvlgbtlhfrzxfhxoeolhq_muflllumega"
    */

    /**
     * The plan
     * 
     * Gather the string input-
     * 
     * Split the string into an array of characters-
     * 
     * find the amount of time each character is found and then is counted into an int array-
     * there will be 27 elements (all letters (26) and underscore (27)
     * the order of the index will go as followed
     *      a = 0 ... z = 25 _ = 26
     * 
     * In a new char array place the largest occurring char first and continue doing so untill you have gone through the occurrance array
     * 
     * Finally, take the new char array and remove all the characters from it starting and including with _ 
     * 
     * output the result
     * 
     */

public class LongStringChallenge{
    
    //fields
    private String userInput;
    private ArrayList<Character> splitInput = new ArrayList<Character>();
    private Map<Character,Integer> valuesOfChar = new HashMap<Character,Integer>();
    private ArrayList<Integer> occurance = new ArrayList<Integer>(27);
    private ArrayList<Character> splitOutput = new ArrayList<Character>();
    private ArrayList<String> splitStringOutput;
    private String output;
    
    private static final char[] ALPH = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '_'};
    private static final String REGX_INCLUDING = "[a-z_]";
    private static final String REGX_EXCLUDING = "[\\s]";
    
    //constructors
    public LongStringChallenge(String in){
        doTheThing(in);
    }
    
    //accessors
    public String getInput(){
        return userInput;
    }
    
    public ArrayList<Character> getSplitInput(){
        return splitInput;
    }
    
    public ArrayList<Integer> getOccurrence(){
        return occurance;
    }
    
    public ArrayList<Character> getSplitOutput(){
        return splitOutput;
    }

    public ArrayList<String> getSplitStringOutput(){
        return splitStringOutput;
    }
    
    public String getOutput(){
        return output;
    }
    
    //mutators
    /**
     * Takes in the user input and stores it in a variable within the class
     * @param: String in - A String input
     */
    public void setInput(String in){
        userInput = in;
    }
    
    /**
     * Takes the stored user input and first checks if it is empty
     * If it is not empty it converts the user input to an Array of characters and then get turned into an ArrayList of characters
     * If it is empty an error message gets sent out
     */
    public void setSplitInput(){
        if(!(userInput.isEmpty())){
            toArrayList(userInput.toCharArray());
        }else{
            System.out.println("User input cannot be empty!");
        }
    }
    
    /**
     * Goes through the split input array list and starts to count the amount of times each character (a-z including _) shows up
     * 
     */
    public void setOccurance(){
        //goes through the whole split input arraylist
        for(int i = 0; i < getSplitInput().size(); i++){ // i is the index of the character of the split input array
            //checking the hashmap
            for(int g = 0; g < valuesOfChar.size(); g++){// g is the index of the charcter for the occurance
                if(splitInput.get(i) == ALPH[g]){//in theory, once found it exits the loop for the next character in the split arraylist
                    occurance.set(g, occurance.get(g)+ 1);
                    break;
                }
            }
        }
    }
    
    // misc methods
    public void doTheThing(String ls){
        setInput(ls);
        setSplitInput();
        setOccurance();
    }
    
    /**
     * Takes a predefined alphabet and puts every character in said alphabet into a hashmap that then in turn has the value of that character
     */
    public void createHashMap(){
        for(int i = 0; i < ALPH.length; i++){
            valuesOfChar.put(ALPH[i], i);
        }
    }
    
    /**
     * @param: T[] array - an array of T(data type) 
     * @return: ArrayList<T> arrayList - the converted arrayList from the array of T(data type)
     */
    public ArrayList<Character> toArrayList(char[] a){
        ArrayList<Character> temp = new ArrayList<Character>();
        for(int i = 0; i < a.length; i++){
            temp.add(i, a[i]);
        }
        return temp;
    }

    
    //Client
    /**public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a large String: ");
        String inp = scan.next();
        LongStringChallenge.doTheThing(inp);
        scan.close();
    }*/
}