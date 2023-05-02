defn calculate-imc [weight height]
  (/ weight (* height height)))

(defn classify-imc [imc]
  (cond (< imc 18.5) "Abaixo do peso"
        (< imc 25) "Peso normal"
        (< imc 30) "Sobrepeso"
        (< imc 35) "Obesidade Grau I"
        (< imc 40) "Obesidade Grau II (severa)"
        :else "Obesidade Grau III (mórbida)"))

(defn read-input [prompt]
  (println prompt)
  (read-line))

(defn -main []
  (let [weight (read-input "Digite seu peso (em kg): ")
        height (read-input "Digite sua altura (em metros): ")
        imc (calculate-imc (Float/parseFloat weight) (Float/parseFloat height))
        classification (classify-imc imc)]
    (println (str "Seu IMC é: " imc))
    (println (str "Classificação: " classification))))