export function decodedValue(value: Array<String>) {
  //throw new Error('Remove this statement and implement this function')
  
  
  let count = 0
  let valueToReturn = ''
  
  value.map((value) => {
    if(count>=2){
      return ''
    }

    switch(value){
      case "black":
        valueToReturn+="0"
        break;
      case "brown":
        valueToReturn+="1"
        break;
      case "red":
        valueToReturn+="2"
        break;
      case "orange":
        valueToReturn+="3"
        break;
      case "yellow":
        valueToReturn+="4"
        break;
      case "green":
        valueToReturn+="5"
        break;
      case "blue":
        valueToReturn+="6"
        break;
      case "violet":
        valueToReturn+="7"
        break;
      case "grey":
        valueToReturn+="8"
        break;
      case "white":
        valueToReturn+="9"
        break;
    }
    
    count++;
  })
  
  return parseInt(valueToReturn);
}
