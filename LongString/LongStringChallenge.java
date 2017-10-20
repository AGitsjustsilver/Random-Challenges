import java.util.ArrayList;

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
     * In a new char array place the largest occurring char first and continue doing so untill you have gone through the occurance array-
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
        private ArrayList<Integer> occurance = new ArrayList<Integer>(27);
        private int[] occuranceSortedIndex;
        private ArrayList<Character> splitOutput = new ArrayList<Character>();
        private String[] splitStringOutput = new String[0];
        private String output;
        
        private static final String TEST_STRING = "cwrxwzbgickpjbp_svnudntddwdqbfgzyiqpuxddmpvyfquosmicfzkjekxzchngpqaksafulateukuwomdrwza_n_ptzktjzcuibnebe_tqessrzqewgkadrkvtyznaupodanwazopg_fijcoojojbsolr_ejesukzc_quochdnmti_lkvrsegyieqlqysuxdvetkqtkhxaiypfdiddztlicjurnllriopdtuuzpryrsepfydyeg_xkr_ruxp_lgqesysidfsygztwrba_ay_gaqqklbrvr_lbhawjraqujfxptmuvqfzklfodgaqrnhjravksjwemoosdlxtvw_qspxmlvqryusfixzlkb_p_c_tepzozzwnokvqspkizygoqpbhjnsxopchzgapctowbrletrunlgnvzpfwrqgedo_s_ygkxz_mpncnve_gfpbotupawevhfxvqhwlerupjfibosbvhiijrodigzyhy_iijes_xsqorshhdzkjqitpljsftpitjetwmzqiabyiewgtbjaddtsjkckcxxvlyrchloetluxkohn_uihkdjpcqgvejanslakmwendgkmvmayknvjjnr_kdapnumwvz__lsimxdtrflyleykxejl_jbkhexpcyreoapelqzzyriyrbxdgbgwrrxlj_pt_mpwubvbveakxfsbfgj___xfqilxpzalazduzucgoxz_yzhkjwamosiwclkicifmebonobknqokyevtwmekackk_kezmjkgmtgaouerwlwfkaaqhkghreoqhfjzpxrlzmbgfpvofpxkmz_cnvcvfsuokpcaimnvdxeizbbgudln__wvkrqpijlncdacmsvytdxmu_zkvzilfrymoxzlovfhdzuarqumibrcvuqfcxdcrvw_ehbwhwjoanluezhthzkpuqd_efilprbskomczdhdoyudx_sybyfuako_xmorjtdnvwlwskpxnhjhmamiyxbyhh_reqlnkbzmrn_oleixht_v_tigjuxpkmmdpxznvbeqdzuedlfywxmcrbttdp_nfzusrrvpttbtabticgdx_cdiookdmupufqhlwiidaveibsyrviqsyvgledamchipkibjftdedyxzqjgvyyrcgwopo_vmldkrzhlatforljbeeqvgonrradkgmzin_mjbareajhewvyiidczysmrmzppgiifvqecxixbtukignqzr_pzokiedmwsw_usamiqngdiolwahtkbyhob_xpvmkdvqbvywmmtogfjogumfom_ppfut_cnxnjwjeiuidnapodo_wiqvgluofjatvkwowosn_vbmdsrwkhbnmlwctcrb_ycyklnxsbhbjkpknlfsccburlfhjhteqnnwrcfonrqifiapfeqqbv_d_rgddzqkjt_eeinwww_oxropsvcpuignzzudsjugxghobkurukspjygbowcic_rmuaatueajsbdswcwnhjaoujs_nbcmmrfjqoqchrvgehdewpicqanwilpirqghzkklsfczavcegoqdflxqamzsppfozsmrmmrzjlfrbxcljdmvxeaxnifyjluwfnqdzmwzepzzxmbyev_ms_flxgevtmyiqifnrsclobraupspnpndekgyxhlkyhuaahgonahtcmhim_ufoevtvemqffnmpgqmxqatvamwaqvogmdottva__yhjbuvco_wytdxssnbqrlqlvcaltxwfaej_ycvlcdqzwxphhwxitcvrpzcdrmmfancifskzzpltgpyskiqpcqiwsufibt_pvquhqadcllygxcshnbrudltm_pkjyfnolo_wqdwhbwpuvduuodtkfhqqzmvjfhvsfdhyi_fkhuspwvqiaestpgkqelgo_lnmmodlmfmyggpizxbjautpleio_zalvo_ryrymndvnzqyermzsrycngihghtampsdpidttqdmqo_iwieomfruotxfduawlrxsbuoncjmqehmtiyqzbilxloywkmtrbvmg__fxczgkcxecgjobcfenwztzivnfwijcmjlqcqcxdkozmjbmfxxuwlawcinh_lbzmepageirjmszxlwfqiaeisrfnuxpiexsgpjo_hvaojqyzqrkdohewbeipbvbqmefftjixqrnzrufbc_ombxljpmiedfnra_ugpnispsrrsuoeckawzsdfvwlgmwxub_hpccvlbwyyyqcxdcsl_f_vwvsgzptetyyjuemsnpkpcgdlxkuyyljhcquwrivsvuhbwvhf_jtgnvvlqpgufpvlgbtlhfrzxfhxoeolhq_muflllumega";
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

        public String[] getSplitStringOutput(){
            return splitStringOutput;
        }
        
        public String getOutput(){
            return output;
        }

        public int[] getOccuranceSortedIndex(){
            return occuranceSortedIndex;
        }
    
    //mutators
        public void doTheThing(String ls){
            setInput(ls);
            setSplitInput();
            setOccurance();
            setOccuranceSortedIndex();
            setSplitOutput();
        }

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
                for(int g = 0; g < ALPH.length; g++){// g is the index of the charcter for the occurance
                    if(splitInput.get(i) == ALPH[g]){//in theory, once found it exits the loop for the next character in the split arraylist
                        occurance.set(g, occurance.get(g)+ 1);
                        break;
                    }
                }
            }
        }

        public void setOccuranceSortedIndex(){
            occuranceSortedIndex = highestIndexList();
        }

        /**
         * takes the index of the highest occuring char 
         * gathers the character and adds it to the split output arraylist
         * 
         */
        public void setSplitOutput(){
            // where i is the index to put the most occuring character in the split output arraylist
            for (int i = 0; i < occuranceSortedIndex.length; i++) {
                splitOutput.add(i, ALPH[occuranceSortedIndex[i]]);
            }
        }

        public void setSplitStringOutput(){
            String full = "";
            for (int i = 0; i < splitOutput.size(); i++) {
                full += splitOutput.get(i);
            }
            splitStringOutput = full.split("[_]");
        }

        public void setOutput(){
            String out = "";
            for (int i = 0; i < splitOutput.size(); i++) {
                
            }
            output = out;
        }
    
    // misc methods
        /**
         * @param: Character[] array - an array of Character 
         * @return: ArrayList<char> arrayList - the converted arrayList from the array of char
         */
        public ArrayList<Character> toArrayList(char[] a){
            ArrayList<Character> temp = new ArrayList<Character>();
            for(int i = 0; i < a.length; i++){
                temp.add(i, a[i]);
            }
            return temp;
        }

        /**
         * 
         * @return: int[] - An array that lists the indexes that show up the most first
         * 
         */
        public int[] highestIndexList(){
            int[] highestIndex = new int[occurance.size()];
            for (int i = 0; i < occurance.size(); i++) { //where i is the index of highestIndex
                for(int g = 0; g < occurance.size(); g++){ //where g is the index of the highest occuring number in occurance
                    int big = 0; //the biggest number in occurance
                    if (big < occurance.get(g)) {
                        big = occurance.get(g);
                        highestIndex[i] = g;
                    }
                }
            }
            return highestIndex;
        }

        public static String printArray(String[] a){
            String s = "";
            for (int i = 0; i < a.length; i++) {
                s += a[i] + ", ";
            }
            return s;
        }

        public static String printArray(ArrayList<Character> a){
            String s = "";
            for (int i = 0; i < a.size(); i++) {
                s += a.get(i)+ ", ";
            }
            return s;
        }
    
    //Client
    public static void main(String[] args){
        LongStringChallenge a = new LongStringChallenge(TEST_STRING);
        System.out.println(printArray(a.getSplitOutput()));
    }
}