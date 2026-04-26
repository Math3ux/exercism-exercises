export function flatten(list: Array<Number>): Array<Number> {
  let Resultado = []
  for(const numero of list){
    if(Array.isArray(numero)){
      Resultado.push(...flatten(numero))
    }else if(typeof numero === "number"){
      Resultado.push(numero)
    }
  }
  return Resultado
}
