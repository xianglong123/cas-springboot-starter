### 条件注解
    @ConditionalOnBean: 当容器里有指定的Bean条件下。
    @ConditionalOnClass: 当类路径下有指定的类的条件下。
    @ConditionalOnExpression: 基于SpEL表达式作为判断条件。
    @ConditionalOnJava: 基于JVM版本作为判断条件。
    @ConditionalOnjndi: 在基于JNDI存在的条件下查找指定的位置。
    @ConditionalOnMissingBean: 当容器里没有Bean的情况下。
    @ConditionalOnMIssingClass: 当类路径下没有指定的类的条件下。
    @ConditionalOnNotWebApplication: 当前项目不是Web项目的条件下。
    @ConditionalOnProperty: 指定的属性是否有指定的值。
    @ConditionalOnResource: 类路径是否有指定的值。
    @ConditionalOnSingleCandidate: 当指定Bean在容器中只有一个，或者虽然有多个但是指定首选的Bean
    @ConditionalOnWebApplication: 当前项目是web项目的条件下